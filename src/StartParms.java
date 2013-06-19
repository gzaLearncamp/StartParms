
public class StartParms {

	/** 19 June 2013 gza nach training an der hsr
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Wir zeigen die Startparameter hier");
			System.out.println(System.getProperty("ApplVersion"));
			System.out.println("Anzahl Start Parameter:" + args.length);
			for (int i = 0;i < args.length; i++){
				System.out.println("Start parameter Nr. " + (i+1) +" " + args[i]);
			}
			
			
			
			
	}

}
