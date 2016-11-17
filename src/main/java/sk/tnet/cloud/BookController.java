package sk.tnet.cloud;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bystriansky
 *
 */
@RestController
public class BookController {
	@Autowired
	private BookRepository bookRepository;
	@RequestMapping("/bookrec")
	public String getBookRecomendation() throws UnknownHostException {
		return "Cheers from OpenSlava: the host in IP: "
				+ InetAddress.getLocalHost().getHostAddress()
				+ " recomends this book: "
				+ bookRepository.getBooksRandomOrder().get(0);
	}
}
