
import java.util.ArrayList;
import java.util.Scanner;




public class Grille {
	
	ArrayList<Case> grille = new ArrayList<Case>();
	int i,j,c=0;
	
	 void construire_bat(Case c,int id_bat){
		if (c.id_case == -1){
				c.id_case=id_bat;
			}
			
		}
		
		//constuction de la grille
	void construire_grille(){
		for(i=0; i<10; i++){
			for(j=0; j<10; j++){
				grille.add(new Case(-1,i,j,false,false));
			}
		}
	}
		 //parcourire la grille
	void afficher_grille(){
		for(Case elem : grille){
			System.out.print(elem.id_case+"\t"+elem.x +"\t"+ elem.y+"|\t");
			c++;
			if(c==10){
				System.out.println();
				c=0;
			}
		}
	}
		
	/*	// construction d'un bateau :
		int y;
		int num_case = 0;
		
		//horizentale		
		for(y=0; y<2 ; y++){
		construire_bat(grille.get(num_case),1);
		num_case++;
		}
		//}
		
		//verticale
		for(y=0; y<2 ; y++){
			construire_bat(grille.get(num_case),1);
			num_case=num_case+10;
			}
		}
		
		
		System.out.println("*********** LA NOUVELLE GRILLE ***********");
		
		for(Case elem : grille){
			System.out.print(elem.id_case+"\t"+elem.x +"\t"+ elem.y+"|\t");
			c++;
			if(c==10
					){
				System.out.println();
				c=0;
			}
			
		}
		
		
	}*/

}
