package com.springbatch.arquivolargurafixa.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springbatch.arquivolargurafixa.dominio.Cliente;

@Configuration
public class LeituraArquivoLarguraFixaWriterConfig {
	
	@Bean
	public ItemWriter<Cliente> leituraArquivoLarguraFixaWriter() {
		ItemWriter<Cliente> itemWriter = items -> items.forEach(System.out::println);
		return itemWriter;
//		return clientes -> {
//			for (Cliente cliente : clientes) {
//				if(cliente.getNome().equals("Maria")) {
//					throw new Exception();
//				}else {
//					System.out.println(cliente);
//				}
//			}
//		};
	}
}
