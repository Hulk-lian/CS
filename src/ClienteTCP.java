import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteTCP {
	
	private String HOST="192.168.3.57";
	private int PORT=5000;
	private Socket socket;
	private String mens="";
	
	public ClienteTCP() {
		try {
			socket= new Socket(HOST,PORT);
			//escritor
			//PrintWriter pr= new PrintWriter(socket.getOutputStream(),true);
			//mens="\"Se tú mismo, excepto si eres gilipollas. Entonces es mejor que seas otro\" (Dalai Lama) ";
			// pr.println(mens);
			 //pr.close();
			//leer mensaje del servidor
			
			BufferedReader br= new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
			mens=br.readLine();
						
			System.out.println(br.readLine());
			
			socket.close();
			br.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new ClienteTCP();

	}

}
