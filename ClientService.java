package myschool.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import myschool.dao.ClientDao;
import myschool.model.Client;

public class ClientService {
	

		public static void main(String[] args) {
			
			SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date dob=null;
			try {
			 dob=dateFormat.parse("15-09-1998");
			 //converts d given string into java util date

			} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}


			Client client=new Client("Harshu",dob);

			ClientDao dao=new ClientDao();
			String res= dao.saveClient(client);
			System.out.println(res);
			}
			// dd-mon-yyyy
			}
		
			/*
		// day mon dd time timezone yyyy

		Client client=new Client("JOHN",new java.util.Date());

		ClientDao dao=new ClientDao();
		String res= dao.saveClient(client);
		System.out.println(res);
		}
		// dd-mon-yyyy
		}
		*/


