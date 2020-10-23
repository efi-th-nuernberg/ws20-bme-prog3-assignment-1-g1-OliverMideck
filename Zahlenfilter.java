class Zahlenfilter {
  public static void main(String[] args) {
    for(int i=1; i<200; i++)
      {
        int vorgaenger = i-1;
        int zahl = i + vorgaenger;

	      if (i % 5 == 0) {
		      System.out.println(i + " ist durch 5 teilbar.");
	      }
	      if (i % 2 == 1 && (i-9) % 10 == 0){
		      System.out.println(i + " endet auf 9.");
	      }
        if(zahl % 3 == 0){
          System.out.println(i + " und " + vorgaenger + " addiert ergeben " + zahl + " und " + zahl + " ist durch 3 teilbar.");
        }
      } 
  }
}