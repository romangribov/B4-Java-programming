public class WebsiteChecker {
    public static void main(String[] args) {

        String[] websites = {
                "bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp",
                "mysql.com", "nasa.gov", "linkedin.com", "ucla.edu", "github.io",
                "spotify.com", "mozilla.org", "nba.com", "comcast.net", "tamu.edu", "utexas.edu"
        };


        int countCom = 0;
        int countOrg = 0;
        int countEdu = 0;
        int countOther = 0;


        for (String website : websites) {

            if (website.endsWith(".com")) {
                countCom++;
            } else if (website.endsWith(".org")) {
                countOrg++;
            } else if (website.endsWith(".edu")) {
                countEdu++;
            } else {
                countOther++;
            }
        }


        System.out.println(".com websites: " + countCom);
        System.out.println(".org websites: " + countOrg);
        System.out.println(".edu websites: " + countEdu);
        System.out.println("Other websites: " + countOther);
    }
}
