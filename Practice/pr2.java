package Practice;
public class pr2 {
    public static void main(String[] args) {

        // String data= "<html><body><p>IT Y2</p><div>Hello</div><p>Java Program</p></body></html>";
        String data= "<html><body><p>IT</p><div>A</div><p>Java Program Test</p></body></html>";
        //String data= "<html><body><p>IT</p><div>A</div><h1>A</h1><p>Program Test</p><br></body></html>";

        int firstP = data.indexOf("<p>");
        int secondP = data.indexOf("<p>" , firstP +1);
        int endP = data.indexOf("</p>", secondP);

        String p = data.substring(secondP + 3, endP);

        System.out.println("P : " + p);
    }
}
