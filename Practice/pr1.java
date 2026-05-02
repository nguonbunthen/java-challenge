package Practice;

public class pr1 {
    public static void main(String[] args) {
        
        String data = "<html><head>Hello World</head><title>My Web Page</title><body>IT Y2</body></html>";
        
        String head = data.substring(data.indexOf("<head>") + 6, data.indexOf("</head>") );
        
        String title = data.substring(data.indexOf("<title>") + 7, data.indexOf("</title>"));

        String body = data.substring(data.indexOf("<body>") + 6, data.indexOf("</body>"));

        System.out.println("Head: " + head);

        System.out.println("Title: " + title);

        System.out.println("Body: " + body);
    }
}
