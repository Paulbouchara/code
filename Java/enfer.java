public class enfer {
  public static int[] modif(int[] tab1, int[] tab2) {
    tab1 = tab2;
    return tab1;
  }
  public static void main (String[] args) {
    int[] t1 = {1,2,3,4,5,6};
    int[] t2 = {4,5,6};
    System.out.print(t1[0]+";");
    t1 = modif(t1,t2);
    System.out.println(t1[0]);
  }
}
