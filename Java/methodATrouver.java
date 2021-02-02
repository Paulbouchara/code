public class cours {
public static void methodATrouver (int[] t1, int[] t2) {
  int[] tt;
  if (t1[0] <= t2[0]) {
    tt = t1;
  } else {
    tt = t2;
  }
  tt[tt.length-1] = -1000;
}
}
