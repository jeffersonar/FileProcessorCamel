package br.com.fileProcessorCamel.router;

import br.com.fileProcessorCamel.process.FileProcessor;
import br.com.fileProcessorCamel.service.FileServiceImpl;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Rotas do Apache Camel 
 * @author jefferson
 */
@Component
public class FileRoute extends RouteBuilder  {


    @Autowired
    private FileServiceImpl fileService;

    
    @Autowired
    private FileProcessor fileProcessor;
    /**
     * Metodo que ler arquivos na pasta e processa as suas informações
     * @throws Exception 
     */
    @Override
    public void configure() throws Exception {
        from("file:".concat(fileService.getInPath()).concat("?include=.*txt&charset=utf-8&delay=5&noop=true"))
                .process(fileProcessor)
                .log("Camel body: ${body}")
                .setHeader(Exchange.FILE_NAME,simple("${file:name.noext}.done.dat"))
                .to("file:".concat(fileService.getOutPath()).concat("?charset=utf-8"));
    }
}
