package com.system.healthcare.data;

import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.system.healthcare.model.Hospital;

/**
 * @author Neeraj
 *
 */
@Configuration
public class JobConfiguration {

	private String HOSPITAL_LISTS = "/data/ALL_INDIA_NETWORK_HOSPITAL_LIST.csv";
	
	@Bean
	public FlatFileItemReader<Hospital> personItemReader() {
		FlatFileItemReader<Hospital> reader = new FlatFileItemReader<>();
		reader.setLinesToSkip(1);
		reader.setResource(new ClassPathResource(this.HOSPITAL_LISTS));

		DefaultLineMapper<Hospital> customerLineMapper = new DefaultLineMapper<>();

		DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();
		tokenizer.setNames(new String[] {"Name", "HID", "Address", "Pincode", "Phoneno", "City", "State"});

		customerLineMapper.setLineTokenizer(tokenizer);
		customerLineMapper.setFieldSetMapper(new PersonFieldSetMapper());
		customerLineMapper.afterPropertiesSet();
		reader.setLineMapper(customerLineMapper);
		return reader;
	}
}
