import java.lang.Math;

class Main {
    public static void main(String args[])
    {
        for (int i = 0; i < 30; i++) {
            double rand = (Math.random()*6) + 1;
            int loc = (int)(Math.random()*100);
            System.out.println(".snowflake:nth-child(" + (i+20) + ") {");
            System.out.println("left: " + loc + "%;");
            System.out.println("animation-duration:" + String.format("%.1f",rand) + "s;");
            System.out.println("}");
        }
    }
}