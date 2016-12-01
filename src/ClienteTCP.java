import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteTCP {
	
	private String HOST="192.168.3.57";
	private int PORT=5000;
	private Socket socket;
	
	public ClienteTCP() {
		try {
			socket= new Socket(HOST,PORT);
			//leer mensaje de exito de conexion
			InputStreamReader is= new InputStreamReader(socket.getInputStream());
			BufferedReader br= new BufferedReader(is);
			
			System.out.println(br.readLine());
			
			socket.close();
			
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
