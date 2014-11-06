
import java.util.ArrayList;


public class Grille {
	
	ArrayList<Case> grille = new ArrayList<Case>();
	int i,j,c=0;
	
	
	
	 public Grille(ArrayList<Case> grille, int i, int j) {
		super();
		this.grille = grille;
		this.i = i;
		this.j = j;
		
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
		

}
