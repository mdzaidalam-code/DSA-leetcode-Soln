public class StudentAttendanceRecord1 {
  public static void main(String[] args) {
    String s = "LAALL";
    int a=0,l=0;

    for (int i = 0; i <s.length(); i++) {
      if (s.charAt(i)=='A') {
        a++;
        if (l<3) {
          l=0;
        }
      }
      
      if (s.charAt(i)=='P') {
        if (l<3) {
          l=0;
        }
      }
      else if (s.charAt(i)=='L') {
        l++;
      }
    }
  
    System.out.println("A = " + a + " l = " + l);
  
    if (a>=2 || l>=3) {
      System.out.println("not allowed");
    }

    else{
      System.out.println("Allowed");
    }
  }

  }

