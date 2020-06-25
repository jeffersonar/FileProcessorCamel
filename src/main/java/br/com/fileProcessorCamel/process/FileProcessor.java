package br.com.fileProcessorCamel.process;

import br.com.fileProcessor.vo.ClientVo;
import br.com.fileProcessor.vo.FileOut;
import br.com.fileProcessor.vo.SaleVo;
import br.com.fileProcessor.vo.SalesmanVo;
import br.com.fileProcessorCamel.service.FileServiceImpl;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jefferson Rodrigues
 */
@Component
public class FileProcessor implements Processor{

    @Autowired
    private FileServiceImpl fileService;
    
    @Override
    public void process(Exchange exchange) throws Exception {
        FileOut outFile = fileService.processFiles(exchange.getIn().getBody(File.class));
        exchange.getMessage().setBody(outFile.toString());
    }
    
}
