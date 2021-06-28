package kodlamaio.hrms.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kodlamaio.hrms.core.utilities.adapters.abstracts.CloudinaryService;
import kodlamaio.hrms.core.utilities.adapters.concrates.CloudinaryServiceAdapters;

@Configuration
public class CloudinaryServiceConfiguration {

	@Value("854575233828428")	
	String apiKey;
	
	@Value("gOSQtj3dzAkJQBFHHiHZ_gjjvS0")
	String apiSecretKey;
	

 	@Bean
    public Cloudinary cloudinaryUser(){
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "hrms-demo",
                "api_key", apiKey,
                "api_secret", apiSecretKey));
    }

    @Bean
    public CloudinaryService cloudinaryService(){
        return new CloudinaryServiceAdapters(cloudinaryUser());
    }
}
