package scale.sync;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.util.MessageHelper;


public class TransformAccountPayload implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {

		//Reset Position in Stream as already read in route with xpath
		
		MessageHelper.resetStreamCache(exchange.getIn());
		
		// Set body to a string so it can be passed as a parameter to BPM
		
		exchange.getIn().setBody(exchange.getIn().getBody(String.class));
		
	}

}
