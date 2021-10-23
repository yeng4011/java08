class Box{
    int length;
    int width;
    int height;
    void volume() {
     System.out.println("volume="+length*width*height);
    }
    void surface() {
     System.out.println("surface="+length*width*6);
    }
    void showdata() {
     System.out.print("length="+length);
     System.out.print("，width="+width);
     System.out.println("，height="+height);
    }
    void showall() {
     System.out.print("length="+length);
     System.out.print("，width="+width);
     System.out.print("，height="+height);
     System.out.print("，volume="+length*width*height);
     System.out.print("，surface="+length*width*6);
    }
   }
   public class ex01 {
   
    public static void main(String[] args) {
     Box box = new Box();
     box.length=1;
     box.width=1;
     box.height=1;
     box.volume();
     box.surface();
     box.showdata();
     box.showall();
    }
   }
