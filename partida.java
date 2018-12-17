import java.util.ArrayList;
import java.util.Scanner;

//Partida
//Jaume Bota Ian Lavergne
public class partida {
		
  	//Jugadores
//		static jugador equipo1 =  new jugador();
//		static jugador equipo2 = new jugador();
//		static jugador equipo3 = new jugador();
//		static jugador equipo4 = new jugador();
//		static jugador equipo5 = new jugador();
		//Misiles por jugador
//		static misiles misiles1 = new misiles();
//		static misiles misiles2 = new misiles();
//		static misiles misiles3 = new misiles();
//		static misiles misiles4 = new misiles();
//		static misiles misiles5 = new misiles();
		//Variables para comprobar
		static  int aequip;
		static int nequip=21;
		static int contronda=1;
		static int conttotalronda=1;
		static int contadormisils;
		static Scanner entrada = new Scanner (System.in);
		static int [] [] array = new int [6] [6];
		static ArrayList<String> frases = new ArrayList<String>();
		static jugador planetitas[] = new jugador[nequip];
		



	public static void main(String[] args) {
		// TODO Auto-generated method stub

    menu();
    
	}
	
   public static void atac(){
	   
	   for(int i = 1; i < nequip ;i++) {
		   
			  System.out.println( planetitas[i].getVida());
			   
			if(planetitas[i].getVida() <= 0) {contronda++;};
			if(contronda>=nequip) {
				
			}else {
				for(int j = 1; j < nequip; j++) {
					System.out.println("Ronda numero: "+conttotalronda);
					System.out.println("Torn equip: "+contronda);
				    System.out.println("¿A quien atacas?");
				    	aequip = entrada.nextInt();
				    if(contronda == aequip) {System.out.println("No te puedes atacar a ti mismo");}
				    if(aequip > nequip && aequip <= 0) {System.out.println("El valor "+aequip+" no es valido, introduce otro porfavor");}
				    
				}
			}
			
		   }

	   if(planetitas[0].getVida()<=0 && contronda==1) {contronda++;}//equipo1
	   if(planetitas[1].getVida()<=0 && contronda==2) {contronda++;}//equipo2
	   if(planetitas[2].getVida()<=0 && contronda==3) {contronda++;}//equipo3
	   if(planetitas[3].getVida()<=0 && contronda==4) {contronda++;}//equipo4
	   if(planetitas[4].getVida()<=0 && contronda==5) {contronda++;}//equipo5
if(planetitas[0].getVida()<=0 && planetitas[1].getVida()<=0 && planetitas[2].getVida()<=0 && planetitas[3].getVida()<=0 && planetitas[4].getVida()<=0) {
	
}else {
	System.out.println("Ronda numero: "+conttotalronda);
	System.out.println("Torn equip: "+contronda);
    System.out.println("¿A quien atacas?");
		 aequip = entrada.nextInt();//2
		do {
		 if(contronda==aequip) {
		     System.out.println("No et pots atacar a tu mateix!!!!");
		     System.out.println("Introdueix un altre equip per atacar");
		     aequip=entrada.nextInt();
		   }else {}
		 if (aequip>5 || aequip<1)
         {System.out.println("A quien intentas atacar chico?");
          System.out.println("(suspiro) Pon un valor entre el 1 y el 5");
          System.out.println("Si quieres intentar atacar a alguien claro esta...");
          aequip=entrada.nextInt();}
		 do {
			System.out.println("Amb cuants misils ataques?");
			contadormisils = entrada.nextInt();
		 }while(contadormisils>50);
      if(contronda==1){
    	  planetitas[0].setContadormisils(contadormisils);    	  
          if(contronda==aequip) {//si contador de ronda es igual a no fa res
          }else {defensa(contadormisils);}//si contador de roda es diferent fa la defensa
          
      }else if (contronda==2){
    	  planetitas[1].setContadormisils(contadormisils);
    	  if(contronda==aequip) {    	//si contador de ronda es igual a no fa res	  
    	  }else {defensa(contadormisils);}//si contador de roda es diferent fa la defensa
    	  
      }else if (contronda==3){
    	  planetitas[2].setContadormisils(contadormisils);
    	  if(contronda==aequip) {}else {defensa(contadormisils);}
    	  
      }else if (contronda==4){
    	  planetitas[3].setContadormisils(contadormisils);
    	  if(contronda==aequip) {}else {defensa(contadormisils);}
    	  
      } else if (contronda==5){
    	  planetitas[4].setContadormisils(contadormisils);
    	  if(contronda==aequip) {}else {defensa(contadormisils);}
    	  
         }
      
		} while (contadormisils > planetitas[0].getMisiles_ronda() || contronda==aequip || aequip>5 || aequip<1);
    
     switch(contronda){//switch case que comprova el contador de roda
         
     
     
     
       case 1:
         if(planetitas[0].getVida()!=0){
         comprobar(contronda,aequip,planetitas[0].getVida(),planetitas[0].getContadormisils());
          }else{}
         break;
         
       case 2:
         if(planetitas[1].getVida()!=0){
         comprobar(contronda,aequip,planetitas[1].getVida(),planetitas[1].getContadormisils());
          }else{}
         break;
         
       case 3:
      	 if(planetitas[2].getVida()!=0){
         comprobar(contronda,aequip,planetitas[2].getVida(),planetitas[2].getContadormisils());
          }else{}
         break;
         
       case 4:
         if(planetitas[3].getVida()!=0){
         comprobar(contronda,aequip,planetitas[3].getVida(),planetitas[3].getContadormisils());
          }else{}
         break;
         
       case 5:
         if(planetitas[4].getVida()!=0){
         comprobar(contronda,aequip,planetitas[4].getVida(),planetitas[4].getContadormisils());
          }else{}
         break;
         
     }
		System.out.println("Ronda" + conttotalronda);
	 if(contronda==5) {
		 System.out.println("Resultats de la Ronda" + contronda);
		 System.out.println(planetitas[0].getVida());
		 System.out.println(planetitas[1].getVida());
		 System.out.println(planetitas[2].getVida());
		 System.out.println(planetitas[3].getVida());
		 System.out.println(planetitas[4].getVida());}
	contronda++;//auemnta el contador de ronda
	if(contronda>5) {contronda=1;conttotalronda++;}
	}
  }

	public static void menu(){
    Scanner valor = new Scanner(System.in);
		int valorr = 0;
		do {
			if (valorr != 6 && valorr < 6) {
				System.out.println(
						"1º JUGAR\n2º CREAR EQUIPOS\n3º REGLAS DEL JUEGO\n4º INFORMACIÓN\n5º MOSTRAR NOMBRES EQUIPOS\n6º SALIR");
			}
			valorr = valor.nextInt();

			if (valorr == 1) {
				//funcio de atac
        atac();
			}

			if (valorr == 2) {
				//funcio de equips
        nom();
			}

			if (valorr == 3) {

				System.out.println("REGLAS DEL JUEGO"
						+ "--------------------------------------------------------------\n"
						+ "Aquest joc es tracta de sobreviure a un atac misilenc entre 5 jugadors\n"
						+ "Cada ronda tindras 50 missils per atacar o per defensar\n"
						+ "Els missils de atac costen 1 missil\n" + "Els missils de defensa costen 2 missils\n"
						+ "Cada ronda es poden ficar un maxim de 50 missils per atacar o 25 missils per defensar\n"
						+ "Els missils es poden posar de defensa i de atac pero en total sol poden haber 50 missils\n"
						+ "Exemple: 30missils per atacar i 10 missils per defensa/50 missils per atacar i 0 missils per defensa\n"
						+ "Quan reps un atac depenent de la cantitat de missils  que tens per a defensar rebrás més o menys mal\n"
						+ "Si el total de missils amb els que t'ataquen es mes petit o igual als que tens de defensa no rebrás mal\n"
						+ "Només tens 200 punts de vida, tothom comença amb 200 punts de vida\n"
						+ "Aquests punts de vida no es poden recuperar ni aumentar\n" + "Ho has entés?");

			}
			if (valorr == 4) {
				System.out.println(
						"- Versión: 1.1\n- Contacto: jbota08@gmail.com\n	    ilavergne.ilerna@gmail.com\n- Autores: Jaume\n	   Ian");

			}

			if (valorr == 5) {
				mostrarnombre();
			}

			if (valorr == 6) {
					break;
			}

			if (valorr != 6 && valorr > 6) {
				System.out.println("Vuelve a introducir un valor del 1 al 6");
			}
  }while (valorr != 6 && valorr < 6);

 }

 public static int comprobar(int contadorderonda,int equipaquiataca,int vida,int contadormisils){
   int cont;
   if(contadorderonda==equipaquiataca){System.out.println("No te pots atacar a tu mateix");}else {
           	switch(equipaquiataca){//switch case que comprova el equip que ataca
              case 1:
                if(vida!=0){
                  array[contadorderonda][1]=contadormisils;
                }else{}
                break;
                
              case 2:
                if(vida!=0){
                  array[contadorderonda][2]=contadormisils;
                }else{}
                break;
                
              case 3:
                if(vida!=0){
                  array[contadorderonda][3]=contadormisils;
                }else{}
                break;
                
              case 4:
                if(vida!=0){
                  array[contadorderonda][4]=contadormisils;
                }else{}
                break;
                
              case 5:
                if(vida!=0){
                  array[contadorderonda][5]=contadormisils;
                }else{}
                break;
            }
            }
   
   		return contadorderonda;
         
 }
public static void defensa(int totalcontadormisils){
	int decontadormisils = 0;
	if(totalcontadormisils>=50) {
		if(contronda==1){planetitas[0].setTotalcontadormisils (totalcontadormisils);
		  //condicions que si el contador de roda es X vagi al equip corresponent i posi el valor que toca
		  
	      } if(contronda==2){planetitas[1].setTotalcontadormisils (totalcontadormisils);
	      
	      } if(contronda==3){planetitas[2].setTotalcontadormisils (totalcontadormisils);
	      
	      } if(contronda==4){planetitas[3].setTotalcontadormisils (totalcontadormisils);
	      
	      } if(contronda==5){planetitas[4].setTotalcontadormisils (totalcontadormisils);}
	      array[contronda][aequip]=totalcontadormisils;
	}else {
    
    
    array[contronda][aequip]=totalcontadormisils;
    
	do{
   		System.out.println("Amb cuants misils defenses?");
			decontadormisils = entrada.nextInt();
	
	  if(contronda==1){planetitas[0].setTotalcontadormisils (planetitas[0].getTotalcontadormisils() + decontadormisils + totalcontadormisils);
	  //condicions que si el contador de roda es X vagi al equip corresponent i posi el valor que toca
	  //totalcontadormisils=decontadormisils+totalcontadormisils;
      } if(contronda==2){planetitas[1].setTotalcontadormisils (planetitas[1].getTotalcontadormisils() + decontadormisils + totalcontadormisils);
      
      } if(contronda==3){planetitas[2].setTotalcontadormisils (planetitas[2].getTotalcontadormisils() + decontadormisils + totalcontadormisils);
      
      } if(contronda==4){planetitas[3].setTotalcontadormisils (planetitas[3].getTotalcontadormisils() + decontadormisils + totalcontadormisils);
      
       } if(contronda==5){planetitas[4].setTotalcontadormisils (planetitas[4].getTotalcontadormisils() + decontadormisils + totalcontadormisils);}
    
	//while que comprova el totalcontadormisils i el valor de cada 	totalcontadormisils, es posa a tots per que pugui agafar la condicio be
    }while	(  totalcontadormisils>50 || planetitas[0].getTotalcontadormisils()>50
    		&& totalcontadormisils>50 || planetitas[1].getTotalcontadormisils()>50
    		&& totalcontadormisils>50 || planetitas[2].getTotalcontadormisils()>50
    		&& totalcontadormisils>50 || planetitas[3].getTotalcontadormisils()>50
    		&& totalcontadormisils>50 || planetitas[4].getTotalcontadormisils()>50 );
	}

	decontadormisils=decontadormisils/2;
	contadormisils=contadormisils-decontadormisils;
	//sobrevida en la defensa
	if(contronda==1) {planetitas[0].setVida(planetitas[0].getVida()+decontadormisils);}
	if(contronda==2) {planetitas[1].setVida(planetitas[1].getVida()+decontadormisils);}
	if(contronda==3) {planetitas[2].setVida(planetitas[2].getVida()+decontadormisils);}
	if(contronda==4) {planetitas[3].setVida(planetitas[3].getVida()+decontadormisils);}
	if(contronda==5) {planetitas[4].setVida(planetitas[4].getVida()+decontadormisils);}
	//vides=vides-contadormisils;
	//restar les vides als altres equips
	if(aequip==1) {planetitas[0].setVida(planetitas[0].getVida()-totalcontadormisils);}
	if(aequip==2) {planetitas[1].setVida(planetitas[1].getVida()-totalcontadormisils);}
	if(aequip==3) {planetitas[2].setVida(planetitas[2].getVida()-totalcontadormisils);}
	if(aequip==4) {planetitas[3].setVida(planetitas[3].getVida()-totalcontadormisils);}
	if(aequip==5) {planetitas[4].setVida(planetitas[4].getVida()-totalcontadormisils);}


    for(int i=1;i<array.length;i++){
    	
    	 if(array[contronda][i] !='x'){
           	System.out.println("el equip: "+contronda+" a atacat al equip: "+i+" amb "+array[contronda][i]+" misils.");
    	//	frases.add("el equip: "+contronda+" a atacat al equip: "+i+" amb "+array[contronda][i]+" misils.");
        }
    	 
    /*	 for(String frase : frases) {
    		 System.out.println(frase);
    	 }*/
    	 
      for(int j=1;j<array.length;j++){
      }
      
    }

	}
	 public static void nom(){
	 System.out.println("Introduce el numero de equipos");
	 nequip = entrada.nextInt();
	 nequip = nequip + 1;
	 
//	ArrayList<jugador> planetitas = new ArrayList<jugador>();
//	 	for(jugador planetitas1 : planetitas) {
//	 		planetitas.addAll(numero, planetitas);
//	 	}		 
		      
	 //Creamos un array de objetos de la clase empleados
	
	 //Creamos 10 empleados por defecto
	 int suma=0;
	 for (int i=1 ;i < nequip;i++){
	 planetitas[i]=new jugador();
	 System.out.println("Introduce el nombre del equipo "+i );
	 planetitas[i].setNombre(entrada.next());
	 }
	 
		 
	


	 }
	 
	 public static void mostrarnombre(){
		 
		  for (int i=1;i<planetitas.length;i++){
				 System.out.println(planetitas[i].getNombre());
				 }
	

	 }
}

