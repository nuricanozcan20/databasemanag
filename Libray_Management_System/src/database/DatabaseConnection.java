package database;

import java.sql.*;

public class DatabaseConnection {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/library";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "yourpassword";
    
    private Connection connection;
    
    public Statement connect() {
    	 try {
             // Registering the MySQL JDBC driver
             Class.forName("com.mysql.cj.jdbc.Driver");

             // Establishing a connection to the database
             connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement();
             System.out.println("Connected to the database.");

             return statement;

         } catch (ClassNotFoundException e) {
             System.out.println("MySQL JDBC driver not found.");
             e.printStackTrace();
         } catch (SQLException e) {
             System.out.println("Failed to connect to the database.");
             e.printStackTrace();
         }
    	 return null;
     }
    
    public void disconnect() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Disconnected from the database.");
            }
        } catch (SQLException e) {
            System.out.println("Failed to disconnect from the database.");
            e.printStackTrace();
        }
    }
    
    public  void createDatabase() {
    	

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Create Statement
            Statement statement = connection.createStatement();

            // Create database if you connect first time
            
            
           // String sql = "CREATE DATABASE " + "library";
           //statement.executeUpdate(sql);
            
            String command = "USE " + "library";
            statement.executeUpdate(command);
            
            //Create User Table
            
            /*
            command = "CREATE TABLE User (" +
                    "lib_id VARCHAR(20) NOT NULL," +
                    "fname VARCHAR(30) NOT NULL," +
                    "minit CHAR(1)," +
                    "lname VARCHAR(30) NOT NULL," +
                    "phonenum VARCHAR(20) NOT NULL," +
                    "PRIMARY KEY (lib_id))";
            statement.executeUpdate(command);
			*/
            
            /*
                     
            // Create Employee table
            command = "CREATE TABLE Employee (" +
                    "e_id VARCHAR(20)," +
                    "fname VARCHAR(30)," +
                    "lname VARCHAR(30)," +
                    "phone_num VARCHAR(15)," +
                    "birth_date VARCHAR(10)," +
                    "gender VARCHAR(10)," +
                    "working_hours VARCHAR(20)," +
                    "password VARCHAR(50),"+
                    "email VARCHAR(50),"+
                    "PRIMARY KEY (e_id))";
            statement.executeUpdate(command);
            
            */
            
            /*
            // Create Book table
            command = "CREATE TABLE Book (" +
                    "isbn VARCHAR(20)," +
                    "title VARCHAR(100)," +
                    "language VARCHAR(20)," +
                    "genre VARCHAR(50)," +
                    "num_pages VARCHAR(20)," +
                    "stock_num INTEGER," +
                    "author_name VARCHAR(50)," +
                    "p_name VARCHAR(50)," +
                    "p_date VARCHAR(20)," +
                    "PRIMARY KEY (isbn))";
            statement.executeUpdate(command);
            
            */

            /*
            // Create Desk table
            command = "CREATE TABLE Desk (" +
                    "desk_num VARCHAR(20)," +
                    "desk_status VARCHAR(40)," +
                    "PRIMARY KEY (desk_num))";
            statement.executeUpdate(command);
            
            */

            
            /*
            // Create Visitor table
            command = "CREATE TABLE Visitor (" +
                    "lib_id VARCHAR(20) NOT NULL," +
                    "PRIMARY KEY (lib_id)," +
                    "FOREIGN KEY (lib_id) REFERENCES User(lib_id)"+
                    ")";
            
            statement.executeUpdate(command);
            
            */
            
            
            /*
            // Create RegisteredMember table
            command = "CREATE TABLE RegisteredMember (" +
        			"lib_id VARCHAR(20) NOT NULL,"+ 
            		"password VARCHAR(50) NOT NULL,"+
                    "cit_id VARCHAR(15) NOT NULL," +
                    "birth_date VARCHAR(15)," +
                    "gender VARCHAR(20)," +
                    "email VARCHAR(50) NOT NULL," +
                    "address VARCHAR(100)," +
                    "reg_date VARCHAR(20) NOT NULL," +
                    "PRIMARY KEY (lib_id, cit_id)," +
                    "FOREIGN KEY (lib_id) REFERENCES User(lib_id)"
                    + ")";
            statement.executeUpdate(command);
            */

            /*
            // Create Rent table
            command = "CREATE TABLE Rent (" +
                    "desk_num VARCHAR(20)," +
                    "lib_id VARCHAR(20)," +
                    "rdate VARCHAR(40),"+
                    "PRIMARY KEY (lib_id, desk_num)," +
                    "FOREIGN KEY (lib_id) REFERENCES User(lib_id)," +
                    "FOREIGN KEY (desk_num) REFERENCES Desk(desk_num))";
            statement.executeUpdate(command);
            */
            
            
            
            /*
            String[] data = {
            	    "L1000,Danielle,J,Tran,2374619013",
            	    "L1001,Ryan,K,Bullock,5994541758",
            	    "L1002,Erin,L,Moore,2840418710",
            	    "L1003,Heather,O,Morse,5200598990",
            	    "L1004,Mary,M,Moss,8358251979",
            	    "L1005,Stephanie,X,Casey,7825044092",
            	    "L1006,Joseph,N,Hill,6303108626",
            	    "L1007,Stephanie,X,Thomas,7826916825",
            	    "L1008,Kenneth,E,Perez,7368483226",
            	    "L1009,Danny,A,Bolton,4586625177",
            	    "L1010,Joshua,D,Smith,2539464811",
            	    "L1011,Heather,R,Cervantes,4254213933",
            	    "L1012,Dawn,G,Barron,2407260199",
            	    "L1013,Richard,O,Miller,3618758049",
            	    "L1014,Sheri,D,Henderson,3621076411",
            	    "L1015,Wayne,K,Stewart,9129845524",
            	    "L1016,Benjamin,I,Newman,9507965849",
            	    "L1017,Michael,O,Davis,7134956420",
            	    "L1018,Martha,Y,Alvarez,6395516621",
            	    "L1019,Benjamin,X,Gonzalez,1292813271",
            	    "L1020,Susan,T,Perez,8743990561",
            	    "L1021,Daniel,D,Robinson,5756910026",
            	    "L1022,Jasmine,D,Kane,2147149362",
            	    "L1023,Stephanie,Y,Ryan,3510447046",
            	    "L1024,Samantha,I,King,3673677324",
            	    "L1025,Jerome,G,Cain,9979477642",
            	    "L1026,Michael,P,Taylor,1988512632",
            	    "L1027,Ryan,O,Chandler,9201500036",
            	    "L1028,Julie,A,Rowland,8575917229",
            	    "L1029,Jamie,D,Graham,9718908124",
            	    "L1030,Ralph,C,Johnson,5059700313",
            	    "L1031,Catherine,J,Sutton,6478206307",
            	    "L1032,Mary,C,Barr,1722273826",
            	    "L1033,Jennifer,U,Cortez,6214832021",
            	    "L1034,Nancy,R,Kelly,9520394718",
            	    "L1035,Julie,J,Atkins,5598641762",
            	    "L1036,Seth,G,Dean,3104371548",
            	    "L1037,Richard,L,Bennett,4205971572",
            	    "L1038,Peter,M,Johnson,2007673725",
            	    "L1039,Jose,V,Boyer,7710763921",
            	    "L1040,Christy,S,Wong,6489378971",
            	    "L1041,Jeffery,S,Snyder,3480190039",
            	    "L1042,Jacob,X,Garza,7702446179",
            	    "L1043,Daniel,M,Carr,8590800406",
            	    "L1044,Cynthia,J,Durham,3411772023",
            	    "L1045,Aaron,U,Perkins,2611407351",
            	    "L1046,April,P,Robinson,2398345422",
            	    "L1047,Dawn,H,Gibson,5931190853",
            	    "L1048,Paul,K,Franco,7726163717",
            	    "L1049,Crystal,P,Evans,3939078570",
            	    "L8000,Justin,J,Boyd,3999135819",
            	    "L8001,Leah,K,Garcia,4617078060",
            	    "L8002,Joseph,L,Martinez,2643838859",
            	    "L8003,Jeffrey,O,Thompson,5620343253",
            	    "L8004,Matthew,M,Gilbert,2684165468",
            	    "L8005,Erik,X,Henderson,2345382593",
            	    "L8006,Andrew,N,Wyatt,6754733104",
            	    "L8007,Matthew,X,Davidson,1890618138",
            	    "L8008,Brittney,E,Zuniga,4576123896",
            	    "L8009,Erica,A,Solomon,4886785362",
            	    "L8010,Tyler,D,Schmidt,1396946233",
            	    "L8011,Eric,R,Walker,5505321356",
            	    "L8012,Margaret,G,Miller,4121341177",
            	    "L8013,Amanda,O,Patel,5268478889",
            	    "L8014,Stephanie,D,Gentry,6877483779",
            	    "L8015,Jennifer,K,Nunez,2703575765",
            	    "L8016,John,I,Haley,1550088255",
            	    "L8017,Laura,O,Perez,5164340306",
            	    "L8018,Amanda,Y,Shields,6470771068",
            	    "L8019,Jeffrey,X,Harris,9934160769",
            	    "L8020,Molly,T,Larsen,1722820099",
            	    "L8021,Angela,D,Williams,1819216313",
            	    "L8022,Angela,D,Martinez,7825583270",
            	    "L8023,Grace,Y,Rodriguez,6014637909",
            	    "L8024,Deborah,I,Brown,7388024931",
            	    "L8025,Colleen,G,Giles,3905300152",
            	    "L8026,Stephen,P,Allen,6396392885",
            	    "L8027,Ralph,O,Copeland,2356494484",
            	    "L8028,Andrew,A,Campbell,2378322702",
            	    "L8029,Michael,D,Leblanc,7811118687",
            	    "L8030,David,C,Torres,8781728886",
            	    "L8031,Christine,J,Walker,6382312591",
            	    "L8032,Kathy,C,Nelson,6553679586",
            	    "L8033,Amanda,U,Crosby,1997437139",
            	    "L8034,Oscar,R,Barajas,1400001977",
            	    "L8035,Joshua,J,Brooks,1285385364",
            	    "L8036,Karen,G,Moore,6364086119",
            	    "L8037,Nicole,L,Edwards,3219431778",
            	    "L8038,Jason,M,Munoz,8762344227",
            	    "L8039,Kevin,V,Holmes,3837863260",
            	    "L8040,Jason,S,Henry,2748767354",
            	    "L8041,Lindsay,S,Stone,8610759835",
            	    "L8042,Christopher,X,Rodgers,5712370930",
            	    "L8043,Amanda,M,Montes,5040431818",
            	    "L8044,Micheal,J,Shaffer,5714974772",
            	    "L8045,James,U,Carr,3852710031",
            	    "L8046,Edward,P,Stone,4394365747",
            	    "L8047,Eric,H,Mccoy,1024684093",
            	    "L8048,Rebecca,K,Contreras,9346636050",
            	    "L8049,Diane,P,Smith,7910389839"
            	    };
            
            for (String entry : data) {
                String[] values = entry.split(",");
                String sql = String.format("INSERT INTO User (lib_id, fname, minit, lname, phonenum) VALUES ('%s', '%s', '%s', '%s', '%s')",
                        values[0], values[1], values[2], values[3], values[4]);
                statement.executeUpdate(sql);
            }
            
			*/
            
            /*
          String[] rusers = {
            	    "L8000,9qxeHImqwwSB,4936457417,12/23/1990,Female,_@gmail.com,559 Alan Shores Port Amyport WI 68529,2/14/2005",
            	    "L8001,pNKAPgTQuk,3508453445,12/24/1990,Male,ibarrasandra@hotmail.com,079 Melanie Extension Apt. 798 North Sarah VT 18425,2/15/2005",
            	    "L8002,kRJsTcnuCL,8028793315,12/25/1990,Female,wyattdennis@hotmail.com,PSC 5972 Box 6906 APO AP 08216,2/16/2005",
            	    "L8003,a?RqXm2VtYp,6837009911,12/26/1990,Female,montgomerytodd@hotmail.com,03987 Nancy Valleys Suite 700 East Lindamouth, KS 64308,2/17/2005",
            	    "L8004,LWA7mrQe?x,4950957608,12/27/1990,Male,ngardner@yahoo.com,529 Woodard Square Katherinechester WI 35516,2/18/2005",
            	    "L8005,cA7IjL7PdS4X,5485787430,12/28/1990,Male,walshwayne@hotmail.com,06895 Kelly Crossroad Apt. 892 Yufort DE 45215,2/19/2005",
            	    "L8006,ZvOKbgKkO93,4869990595,12/29/1990,Female,nuneznicholas@yahoo.com,8325 Jason Pines Sheppardside AR 45129,2/20/2005",
            	    "L8007,z4T!6IMFk0,9841046805,12/30/1990,Female,david99@yahoo.com,48660 Megan Keys Suite 045 Carpentermouth MA 05931 ,2/21/2005",
            	    "L8008,Fz6OZt0HOg,1796273928,12/31/1990,Male,echambers@yahoo.com,4165 Jason Passage Apt. 495 North Christine GA 78205,2/22/2005",
            	    "L8009,UnpVJF8hML,5984717782,1/1/1991,Female,palmerscott@gmail.com,992 Lopez Stravenue Lindseyborough WV 34263,2/23/2005",
            	    "L8010,pOsRZl2mW8,4991680570,1/2/1991,Female,lmarks@hotmail.com,257 Janice Creek Oliviashire NV 41321,2/24/2005",
            	    "L8011,fnbGq6OuOFZ,5885979729,1/3/1991,Female,anthony38@gmail.com,\"3182 Payne View Aliciafort DC 86939\",2/25/2005",
            	    "L8012,vQpyJIM6rE,1149604470,1/4/1991,Male,burnsjonathon@holt-liu.com,\"99082 Barrera Squares North Bethany, IA 40648\",2/26/2005",
            	    "L8013,acrcR9toQ99,9066281870,1/5/1991,Female,kevinfreeman@hotmail.com,\"607 Dwayne Flats Lake Mark MI 48008\",2/27/2005",
            	    "L8014,!hRL5HjkaT8,8067758163,1/6/1991,Male,melaniewright@yahoo.com,\"704 Hunter Point Apt. 509 Spencerton KY 27131\",2/28/2005",
            	    "L8015,nP!hm95ftY,8715104565,1/7/1991,Female,jackson21@melendez.com,\"40474 Brandy Summit Suite 027 South Michael MS 81754\",3/1/2005",
            	    "L8016,qslZeM8wyPt7,8653053113,1/8/1991,Male,sean63@gmail.com,\"79445 Rebecca Port Apt. 827 Port Ralphborough NC 84182\",3/2/2005",
            	    "L8017,k0U0e9JBc0,4994974231,1/9/1991,Female,gmcguire@gmail.com,\"48957 Kramer Stream Apt. 989 Ashleystad GA 18971\",3/3/2005",
            	    "L8018,TjkZZzzyAIz,1257311552,1/10/1991,Male,jennifer38@harris.com,\"057 Scott Union Johnsonland PA 27852\",3/4/2005",
            	    "L8019,EfiT80jypqNx,377158762,1/11/1991,Female,tommy17@yahoo.com,\"1523 Peterson Forks Lewisfort KS 83187\",3/5/2005",
            	    "L8020,XRGSXbPs!7E,8960182362,1/12/1991,Male,micheal43@werner-jenkins.net,\"72570 Rick Port Suite 646 Robinsonborough OK 23660\",3/6/2005",
            	    "L8021,8XWpjw6Yf6W,4060121866,1/13/1991,Female,shari15@robinson.com,\"45388 Williams Unions Apt. 307 East Arthurland OR 84019\",3/7/2005",
            	    "L8022,pg?3rQEkfT,1244459332,1/14/1991,Male,daniel46@wade.org,\"2516 Eric Pine Apt. 718 Stephenview MD 97491\",3/8/2005",
            	    "L8023,aU2wkoyyktFD,7890466637,1/15/1991,Male,sydneyrichards@woods-price.info,\"63925 Burns Knolls Williamfurt MS 77468\",3/9/2005",
            	    "L8024,rEi3K.61XbZq,5520934280,1/16/1991,Male,kim69@weaver.com,\"8409 Brittany Walk Nancymouth MS 77700\",3/10/2005",
            	    "L8025,6VrvUWCeTXz7,2943488291,1/17/1991,Male,michaelanderson@johnson-cervantes.biz,\"0660 Brett Avenue Flowersshire AK 55206\",3/11/2005",
            	    "L8026,lpSrN51aEj5s,4393306273,1/18/1991,Male,nicole00@yahoo.com,\"517 Finley Ways New Heather CT 36419\",3/12/2005",
            	    "L8027,XleLzZzQ0cr,5136464099,1/19/1991,Female,lauren69@cummings-rodriguez.com,\"37753 Kathy Lake Sanchezberg MO 63017\",3/13/2005",
            	    "L8028,dqWIsyGUEgQ,1725160782,1/20/1991,Female,troyparker@bullock-leach.biz,\"18761 Rodriguez Garden Suite 749 South Matthewchester WI 49231\",3/14/2005",
            	    "L8029,.55zokG68V,6737333832,1/21/1991,Male,michaelaustin@gmail.com,\"704 Wallace Trail Suite 999 Cunninghamton WV 32995\",3/15/2005",
            	    "L8030,kY3hXs1UlKD,7440618071,1/22/1991,Male,wilsonbrian@hotmail.com,\"USNV Burton FPO AP 98555\",3/16/2005",
            	    "L8031,VTwBcJ2Lhtl,9274063174,1/23/1991,Female,michael48@gmail.com,\"87257 Helen Haven Port Angelaburgh OK 08486\",3/17/2005",
            	    "L8032,c3FgN3pY9LH4,2066269539,1/24/1991,Male,santosraymond@bell.net,\"960 Jodi Loaf New Barry OK 17035\",3/18/2005",
            	    "L8033,VhzVlhQc!9Aw,9125217590,1/25/1991,Female,vwaters@gardner-mcdonald.com,\"714 Wood Point Suite 314 New Jesse OR 35197\",3/19/2005",
            	    "L8034,WcVGFpKOSZgj,7242891005,1/26/1991,Female,fishersharon@nash.net,\"37737 Susan Course Port Chad NC 36510\",3/20/2005",
            	    "L8035,?opN70sV7!af,4380378013,1/27/1991,Female,gjones@gmail.com,\"97201 James Ways Suite 501 Erikberg MS 21389\",3/21/2005",
            	    "L8036,d27tLO53mUn,2915616170,1/28/1991,Female,uburns@watson.com,\"56436 Parker Extension Bartonborough HI 66899\",3/22/2005",
            	    "L8037,PYiI95bvmx,2100250543,1/29/1991,Male,evansrichard@ramirez.com,\"023 Richard Loaf Johnside AL 48507\",3/23/2005",
            	    "L8038,fayCnzq7.zo,8654911529,1/30/1991,Male,mparker@hernandez.org,\"PSC 9151 Box 5618 APO AP 84543\",3/24/2005",
            	    "L8039,ZPCzO8OWXlP,8534705372,1/31/1991,Female,uhiggins@hotmail.com,\"9808 Jose Path North Tonimouth OH 19952\",3/25/2005",
            	    "L8040,E6ZXediFlM,5527098417,2/1/1991,Female,nichole19@yahoo.com,\"3977 Darlene Extensions Suite 893 Gregoryburgh MA 26775\",3/26/2005",
            	    "L8041,EkHjuqArded,4337473499,2/2/1991,Female,christinethompson@hotmail.com,\"41730 Sullivan Underpass Suite 776 Dixonfort MT 96735\",3/27/2005",
            	    "L8042,qnPHSdJTS.,4642767582,2/3/1991,Male,johnsonrenee@hotmail.com,\"73717 Donna Viaduct Suite 357 Port George OH 58383\",3/28/2005",
            	    "L8043,NfZTPTP30UY,8040793851,2/4/1991,Male,grahamolivia@gmail.com,\"0068 Harmon Skyway West Georgebury MD 26159\",3/29/2005",
            	    "L8044,em!DsqRzFQEv,6584692365,2/5/1991,Female,xhughes@hotmail.com,\"07688 Kristina Spring New Suzanne WV 77463\",3/30/2005",
            	    "L8045,LAl2u9r7D0,8413897812,2/6/1991,Female,tracynielsen@gmail.com,\"7734 Justin Square East Dustin ID 67611\",3/31/2005",
            	    "L8046,w0rLsRjuJVYc,1230651180,2/7/1991,Female,paul63@hotmail.com,\"234 Lisa Harbor Suite 268 North Scottton MS 10536\",4/1/2005",
            	    "L8047,e5zFcsOkuH,7350233529,2/8/1991,Female,philip68@hotmail.com,\"0751 Smith Grove Apt. 137 Smithshire TN 48632\",4/2/2005",
            	    "L8048,x7jPqKEbfPtB,5883409188,2/9/1991,Female,cramirez@pitts-reyes.org,\"178 Michael Plaza North Danielfurt MI 65665\",4/3/2005",
            	    "L8049,T1olvvqrZ0,4703146229,2/10/1991,Female,jason22@hotmail.com,\"76312 Brewer Spur North Mary OR 87687\",4/4/2005"
            };
            
            
            for (String entry : rusers) {
                String[] values = entry.split(",");
                String sql = String.format("INSERT INTO RegisteredMember VALUES ('%s', '%s', '%s', '%s', '%s','%s','%s','%s')",
                        values[0], values[1], values[2], values[3], values[4],values[5],values[6],values[7]);
                statement.executeUpdate(sql);
            }
            */
            
            /*
            String[] employee = {
            		"E0001,Bridget,Meyer,5524933798,10/30/1973,Female,21,g4qwTu!.gmZ,bridget_meyer@gmail.com",
            	    "E0002,Sandra,Cook,5310622067,10/31/1973,Female,30,hIFpttugy4,sandra_cook@gmail.com",
            	    "E0003,Christopher,Klein,8293882015,11/1/1973,Female,32,!nfhreex16,christopher_klein@gmail.com",
            	    "E0004,Mary,Carlson,6528614522,11/2/1973,Male,23,r1Ap.!E7nHl,mary_carlson@gmail.com",
            	    "E0005,John,Wright,5328088040,11/3/1973,Male,21,DGXSsskZzuW1,john_wright@gmail.com",
            	    "E0006,Cathy,Mendoza,1487558354,11/4/1973,Female,32,9a3JUyoY6b,cathy_mendoza@gmail.com",
            	    "E0007,Kevin,Green,7123456051,11/5/1973,Female,31,OCN4FubmKhd,kevin_green@gmail.com",
            	    "E0008,Emma,Cooley,2866348456,11/6/1973,Female,29,0h5.ojQyTocw,emma_cooley@gmail.com",
            	    "E0009,Douglas,Garcia,1473493096,11/7/1973,Male,24,OWNId4CYnpVt,douglas_garcia@gmail.com",
            	    "E0010,Donna,Humphrey,1615310780,11/8/1973,Male,23,FSoRPGg.TTFN,donna_humphrey@gmail.com",
            	    "E0011,Kayla,Haynes,3438158241,11/9/1973,Female,28,H0C0R5UQOn7,kayla_haynes@gmail.com",
            	    "E0012,Lauren,Fowler,4760202891,11/10/1973,Female,38,pV.Pcpz?WRce,lauren_fowler@gmail.com",
            	    "E0013,Joshua,Baker,5010823968,11/11/1973,Female,38,qqcDv0Z6iRqM,joshua_baker@gmail.com",
            	    "E0014,Tara,Newton,2350421746,11/12/1973,Female,33,05Fahoi.bz6,tara_newton@gmail.com",
            	    "E0015,Jim,Williams,9190762084,11/13/1973,Female,30,a2m7bVAML0Vy,jim_williams@gmail.com",
            	    "E0016,Tiffany,Simon,3902614915,11/14/1973,Male,24,K0scB3o1ZO,tiffany_simon@gmail.com",
            	    "E0017,Louis,Green,9963670130,11/15/1973,Male,25,RwLpCYMQTeg,louis_green@gmail.com",
            	    "E0018,Lauren,Hernandez,1279262757,11/16/1973,Female,32,!ccKSH4!0I,lauren_hernandez@gmail.com",
            	    "E0019,Anne,Blankenship,1142396339,11/17/1973,Male,26,ZJcMS!QSuhqu,anne_blankenship@gmail.com",
            	    "E0020,Margaret,Krueger,9786884411,11/18/1973,Female,22,VvVW5uJ!LxD,margaret_krueger@gmail.com",
            	    "E0021,April,Lopez,1654650717,11/19/1973,Female,26,XBjSKbsrDltc,april_lopez@gmail.com",
            	    "E0022,Holly,White,2560850902,11/20/1973,Female,26,G?nQacyTENT2,holly_white@gmail.com",
            	    "E0023,Jessica,Johnson,7376973746,11/21/1973,Male,37,Qg?9E?!7tX!,jessica_johnson@gmail.com",
            	    "E0024,Tristan,Wright,8080591591,11/22/1973,Male,24,NhBlrneOct,tristan_wright@gmail.com",
            	    "E0025,Lori,Wright,2542773799,11/23/1973,Male,38,AA?szsJmQMD,lori_wright@gmail.com",
            	    "E0026,Michele,Diaz,2874166555,11/24/1973,Female,36,FYRQEnGwlr,michele_diaz@gmail.com",
            };
            
            for (String entry : employee) {
                String[] values = entry.split(",");
                String sql = String.format("INSERT INTO Employee VALUES ('%s', '%s', '%s', '%s', '%s','%s','%s','%s','%s')",
                        values[0], values[1], values[2], values[3], values[4],values[5],values[6],values[7],values[8]);
                statement.executeUpdate(sql);
            }
            */
            
            /*
            
            String [] visitor = {
            	    "L1000", "L1001", "L1002", "L1003", "L1004", "L1005", "L1006", "L1007", "L1008", "L1009",
            	    "L1010", "L1011", "L1012", "L1013", "L1014", "L1015", "L1016", "L1017", "L1018", "L1019",
            	    "L1020", "L1021", "L1022", "L1023", "L1024", "L1025", "L1026", "L1027", "L1028", "L1029",
            	    "L1030", "L1031", "L1032", "L1033", "L1034", "L1035", "L1036", "L1037", "L1038", "L1039",
            	    "L1040", "L1041", "L1042", "L1043", "L1044", "L1045", "L1046", "L1047", "L1048", "L1049"
            };
            
            for (String entry : visitor) {
                String[] values = entry.split(",");
                String sql = String.format("INSERT INTO Visitor VALUES ('%s')",
                        values[0]);
                statement.executeUpdate(sql);
            }
            */
            
            /*
            String [] book = {
            		  "978-0-565-97179-3,Know section radio including,English,Non-fiction,384,97,Emma Warren,Lopez-Dickerson Publishing,10/22/2020",
            		    "978-0-323-06861-1,Of phone,German,Non-fiction,561,88,Stephen Cook,Holt Flores and Jenkins Publishing,10/23/2020",
            		    "978-1-56285-322-8,Live seat training,Chinese,Mystery,110,99,Peggy Maldonado,Green Smith and Lewis Publishing,10/24/2020",
            		    "978-1-78959-515-4,Husband until stand,Spanish,Science Fiction,243,28,Bryan Caldwell,Moreno Group Publishing,10/25/2020",
            		    "978-1-170-07362-9,Indicate dinner not,French,Fantasy,995,65,Carolyn Mercado,Patterson Miller and Daugherty Publishing,10/26/2020",
            		    "978-1-331-97674-5,Reality or,Chinese,Science Fiction,194,78,Scott Davidson,Lee Evans and Williams Publishing,10/27/2020",
            		    "978-0-286-18812-8,Fear clear charge,German,Fantasy,766,45,Jamie Williams,Doyle-Brown Publishing,10/28/2020",
            		    "978-1-81239-711-3,Her interest guy,Chinese,Fantasy,109,43,Joshua Miller,Lawson Walsh and Howard Publishing,10/29/2020",
            		    "978-1-132-58110-0,Sport western,English,Mystery,950,91,Timothy Gonzalez,Terry Hill and Lopez Publishing,10/30/2020",
            		    "978-0-266-04029-3,Leg authority TV more,Spanish,Fiction,177,74,Timothy Brown,Bowen Vargas and Lee Publishing,10/31/2020",
            		    "978-1-341-24523-7,Alone understand way meeting,English,Fantasy,145,55,Luis Colon,Smith-Adams Publishing,11/1/2020",
            		    "978-1-189-93158-3,Build indeed floor,Chinese,Non-fiction,877,99,Nicholas Brown,DanielsRichmond and Thompson Publishing,11/2/2020",
            		    "978-1-904614-01-2,Health war growth,German,Fantasy,440,44,Robert George,Wilson-Gonzalez Publishing,11/3/2020",
            		    "978-1-198-78386-9,Citizen pressure your practice,German,Non-fiction,129,3,Kimberly Chavez,Bird Ltd Publishing,11/4/2020",
            		    "978-0-18-137602-6,General serious heart world film,Spanish,Non-fiction,724,82,Gregory Walker,Bell-Jones Publishing,11/5/2020",
            		    "978-0-8033-3250-8,Treat lawyer sometimes,Spanish,Non-fiction,402,41,Patricia Spencer,Nguyen and Sons Publishing,11/6/2020",
            		    "978-0-17-607256-8,Pick seat political,French,Non-fiction,288,52,Kathryn Daniels,Brown and Sons Publishing,11/7/2020",
            		    "978-0-419-06835-8,Guy great day,French,Science Fiction,657,67,Stephanie Hall,Garcia Gamble and Williams Publishing,11/8/2020",
            		    "978-1-374-73112-7,Enjoy risk whom,French,Fiction,238,36,Patricia King,Rodriguez-Stanley Publishing,11/9/2020",
            		    "978-0-330-16798-7,Even red relationship painting,English,Fiction,984,39,Benjamin Miller,Wilson Perez and Stewart Publishing,11/10/2020",
            		    "978-1-4924-7710-5,Hard you point price stage,French,Fiction,293,5,Bradley Myers,Solomon Inc Publishing,11/11/2020",
            		    "978-0-01-978695-9,Occur reflect arrive including,French,Non-fiction,863,1,David Jackson,Franco PLC Publishing,11/12/2020",
            		    "978-1-9831-4767-8,Even product my new sure,Spanish,Fiction,823,59,Rachel Erickson,Greene Mendez and Rivas Publishing,11/13/2020",
            		    "978-0-920431-11-5,Lead future statement,Chinese,Science Fiction,787,15,Taylor Moore,Ball Villarreal and Bell Publishing,11/14/2020",
            		    "978-0-19-581912-0,Would common partner,Spanish,Mystery,604,11,Nathaniel Young,Taylor Nguyen and Johnson Publishing,11/15/2020",
            		    "978-0-12-632799-1,Time stop especially above culture,Spanish,Science Fiction,568,20,Tonya Hardy,Schultz Lane and Frey Publishing,11/16/2020",
            		    "978-1-154-74836-9,Teacher between chair,English,Fiction,418,90,Kimberly Collins,Gonzales Mack and Todd Publishing,11/17/2020",
            		    "978-1-80844-639-9,Federal toward society bar,English,Fiction,834,10,Charlotte Odom,Adams Campos and Haney Publishing,11/18/2020",
            		    "978-1-206-93693-5,Trip letter them,Chinese,Fiction,682,79,Christopher Stewart,Thomas Patterson and Weaver Publishing,11/19/2020",
            		    "978-0-314-24659-2,Southern beyond,English,Fantasy,379,26,Kathleen Martin,Williams Group Publishing,11/20/2020",
            		    "978-1-83613-310-0,Forward nothing pressure,English,Mystery,412,25,Lisa Nelson,Whitaker Barnett and Cook Publishing,11/21/2020",
            		    "978-0-7177-0782-9,Region also out nature,English,Fantasy,519,83,Patricia Burke,Conley-Stewart Publishing,11/22/2020",
            		    "978-1-70624-630-5,Team compare between,German,Fantasy,941,31,Samantha Walker,Ramos Miller and Tucker Publishing,11/23/2020",
            		    "978-1-4482-1209-5,Cause person sense,English,Fantasy,272,48,Alexander Sanford,Jones-Wong Publishing,11/24/2020",
            		    "978-1-01-351325-1,Official test after,German,Fiction,412,24,Emily Dennis,Preston Franco and Tyler Publishing,11/25/2020",
            		    "978-0-217-28566-7,Federal somebody,Chinese,Mystery,988,96,Mary Foster,Valdez Morgan and Williamson Publishing,11/26/2020",
            		    "978-0-364-98724-7,Time close,Chinese,Mystery,610,86,Erin Robbins,Adkins Richardson and Snyder Publishing,11/27/2020",
            		    "978-0-7878-7736-1,Strategy my four office,German,Fantasy,340,66,Scott Brown,Orozco-Torres Publishing,11/28/2020",
            		    "978-1-64960-342-5,High drop phone,German,Mystery,127,98,Chad Delgado,Mueller Hammond and Phillips Publishing,11/29/2020",
            		    "978-0-503-58605-8,Pay expect I rate,English,Science Fiction,677,97,Jason Pineda,Leonard-Evans Publishing,11/30/2020",
            		    "978-0-269-66133-4,Girl alone television,English,Fantasy,319,89,Katherine Mcdowell,Gutierrez PLC Publishing,12/1/2020",
            		    "978-0-503-98790-9,Floor organization Democrat focus,English,Fiction,279,50,Christopher Reynolds,Espinoza-Foley Publishing,12/2/2020",
            		    "978-1-123-27087-7,Try court without,Spanish,Non-fiction,748,14,Laura Koch,Gonzales-Franklin Publishing,12/3/2020",
            		    "978-1-203-49127-7,Government ball assume poor,Chinese,Science Fiction,939,68,William Clark,Hayes and Sons Publishing,12/4/2020",
            		    "978-1-04-955814-1,Tough task,Chinese,Mystery,932,24,Robert Rivera,Miller-Finley Publishing,12/5/2020",
            		    "978-1-71495-093-5,Provide impact oil door,French,Fiction,934,15,Cory Lynch,Nichols-Clarke Publishing,12/6/2020",
            		    "978-0-330-93788-7,Word newspaper product follow,Spanish,Non-fiction,269,11,Matthew Duran,Wright-Schmidt Publishing,12/7/2020",
            		    "978-1-312-81055-6,Foot place color personal,German,Fiction,614,55,Kelly Smith,Myers-Miller Publishing,12/8/2020",
            		    "978-0-7967-3152-4,Hair accept,English,Non-fiction,701,88,Christopher Barnes,Gonzalez Inc Publishing,12/9/2020",
            		    "978-0-7315-7831-3,Shoulder particular rich,German,Mystery,255,20,Frank Fields,Gonzales-Mcclure Publishing,12/10/2020"
            };
            
            
            for (String entry : book) {
                String[] values = entry.split(",");
                String sql = String.format("INSERT INTO Book VALUES ('%s', '%s', '%s', '%s', '%s','%s','%s','%s','%s')",
                        values[0], values[1], values[2], values[3], values[4],values[5],values[6],values[7],values[8]);
                statement.executeUpdate(sql);
            }
            */
            /*
            String[] deskStatus = {
            	    "D0400,Available",
            	    "D0401,Available",
            	    "D0402,Reserved",
            	    "D0403,Reserved",
            	    "D0404,Available",
            	    "D0405,Reserved",
            	    "D0406,Reserved",
            	    "D0407,Available",
            	    "D0408,Reserved",
            	    "D0409,Available",
            	    "D0410,Reserved",
            	    "D0411,Reserved",
            	    "D0412,Available",
            	    "D0413,Available",
            	    "D0414,Reserved",
            	    "D0415,Available",
            	    "D0416,Available",
            	    "D0417,Available",
            	    "D0418,Available",
            	    "D0419,Reserved",
            	    "D0420,Available",
            	    "D0421,Reserved",
            	    "D0422,Available",
            	    "D0423,Available",
            	    "D0424,Reserved",
            	    "D0425,Reserved",
            	    "D0426,Available",
            	    "D0427,Reserved",
            	    "D0428,Available",
            	    "D0429,Available",
            	    "D0430,Reserved",
            	    "D0431,Reserved",
            	    "D0432,Reserved",
            	    "D0433,Reserved",
            	    "D0434,Available",
            	    "D0435,Reserved",
            	    "D0436,Reserved",
            	    "D0437,Available",
            	    "D0438,Available",
            	    "D0439,Reserved",
            	    "D0440,Available",
            	    "D0441,Available",
            	    "D0442,Reserved",
            	    "D0443,Available",
            	    "D0444,Reserved",
            	    "D0445,Reserved",
            	    "D0446,Available",
            	    "D0447,Reserved",
            	    "D0448,Available",
            	    "D0449,Reserved"
            	};
            
            
            
            for (String entry : deskStatus) {
                String[] values = entry.split(",");
                String sql = String.format("INSERT INTO Desk VALUES ('%s', '%s')",
                        values[0], values[1]);
                statement.executeUpdate(sql);
            }
            
            */
            /*
            command = "CREATE TABLE Borrow (" +
                    "lib_id VARCHAR(20)," +
                    "isbn VARCHAR(20)," +
                    "bdate VARCHAR(30),"+
                    "rdate VARCHAR(30),"+
                    "PRIMARY KEY (lib_id, isbn)," +
                    "FOREIGN KEY (lib_id) REFERENCES User(lib_id)," +
                    "FOREIGN KEY (isbn) REFERENCES Book(isbn))";
            statement.executeUpdate(command);
            */
            
            /*
            
            String[] bookS = {
            	    "L8003,978-0-565-97179-3,1/31/2023,3/21/2024",
            	    "L8004,978-0-323-06861-1,2/1/2023,3/22/2024",
            	    "L8005,978-1-56285-322-8,2/2/2023,3/23/2024",
            	    "L8006,978-1-78959-515-4,2/3/2023,3/24/2024",
            	    "L8007,978-1-170-07362-9,2/4/2023,3/25/2024",
            	    "L8008,978-1-331-97674-5,2/5/2023,3/26/2024",
            	    "L8009,978-0-286-18812-8,2/6/2023,3/27/2024",
            	    "L8010,978-1-81239-711-3,2/7/2023,3/28/2024",
            	    "L8011,978-1-132-58110-0,2/8/2023,3/29/2024",
            	    "L8012,978-0-266-04029-3,2/9/2023,3/30/2024",
            	    "L8013,978-1-341-24523-7,2/10/2023,3/31/2024",
            	    "L8014,978-1-189-93158-3,2/11/2023,4/1/2024",
            	    "L8015,978-1-904614-01-2,2/12/2023,4/2/2024",
            	    "L8016,978-1-198-78386-9,2/13/2023,4/3/2024",
            	    "L8017,978-0-18-137602-6,2/14/2023,4/4/2024",
            	    "L8018,978-0-8033-3250-8,2/15/2023,4/5/2024",
            	    "L8019,978-0-17-607256-8,2/16/2023,4/6/2024",
            	    "L8020,978-0-419-06835-8,2/17/2023,4/7/2024",
            	    "L8021,978-1-374-73112-7,2/18/2023,4/8/2024",
            	    "L8022,978-0-330-16798-7,2/19/2023,4/9/2024",
            	    "L8023,978-1-4924-7710-5,2/20/2023,4/10/2024",
            	    "L8024,978-0-01-978695-9,2/21/2023,4/11/2024",
            	    "L8025,978-1-9831-4767-8,2/22/2023,4/12/2024",
            	    "L8026,978-0-920431-11-5,2/23/2023,4/13/2024",
            	    "L8027,978-0-19-581912-0,2/24/2023,4/14/2024",
            	    "L8035,978-0-12-632799-1,2/25/2023,4/15/2024",
            	    "L8036,978-1-154-74836-9,2/26/2023,4/16/2024",
            	    "L8037,978-1-80844-639-9,2/27/2023,4/17/2024",
            	    "L8038,978-1-206-93693-5,2/28/2023,4/18/2024",
            	    "L8039,978-0-314-24659-2,3/1/2023,4/19/2024",
            	    "L8040,978-1-83613-310-0,3/2/2023,4/20/2024",
            	    "L8041,978-0-7177-0782-9,3/3/2023,4/21/2024",
            	    "L8042,978-1-70624-630-5,3/4/2023,4/22/2024",
            	    "L8043,978-1-4482-1209-5,3/5/2023,4/23/2024",
            	    "L8044,978-1-01-351325-1,3/6/2023,4/24/2024",
            	    "L8045,978-0-217-28566-7,3/7/2023,4/25/2024",
            	    "L8046,978-0-364-98724-7,3/8/2023,4/26/2024",
            	    "L8047,978-0-7878-7736-1,3/9/2023,4/27/2024",
            	    "L8048,978-1-64960-342-5,3/10/2023,4/28/2024",
            	    "L8049,978-0-503-58605-8,3/11/2023,4/29/2024"
            	};
            
            for (String entry : bookS) {
                String[] values = entry.split(",");
                String sql = String.format("INSERT INTO Borrow VALUES ('%s', '%s','%s','%s')",
                        values[0], values[1],values[2],values[3]);
                statement.executeUpdate(sql);
            }
            
            */
            /*
            String[] appointments = {
            	    "D0401,L8001,1/31/23 11:00",
            	    "D0417,L8003,2/1/23 11:30",
            	    "D0409,L8004,2/2/23 14:30",
            	    "D0431,L8005,2/3/23 15:00",
            	    "D0407,L8011,2/4/23 17:00",
            	    "D0438,L8012,2/5/23 16:00",
            	    "D0422,L8013,2/6/23 18:30",
            	    "D0426,L8015,2/7/23 20:00",
            	    "D0418,L8017,2/8/23 10:00",
            	    "D0434,L8018,2/9/23 9:00",
            	    "D0429,L1007,2/10/23 9:30",
            	    "D0420,L1008,2/11/23 15:30",
            	    "D0436,L1017,2/12/23 15:00",
            	    "D0413,L1018,2/13/23 20:00",
            	    "D0432,L1019,2/14/23 11:00",
            	    "D0404,L1020,2/15/23 12:00",
            	    "D0444,L1021,2/16/23 15:30",
            	    "D0400,L1022,2/17/23 18:00",
            	    "D0430,L1023,2/18/23 17:30",
            	    "D0416,L1024,2/19/23 21:00",
            	    "D0424,L1025,2/20/23 12:00",
            	    "D0425,L1026,2/21/23 11:30",
            	    "D0441,L1027,2/22/23 15:30",
            	    "D0406,L1028,2/23/23 19:00",
            	    "D0437,L1029,2/24/23 21:30"
            	};


            
            for (String entry : appointments) {
                String[] values = entry.split(",");
                String sql = String.format("INSERT INTO Rent VALUES ('%s', '%s','%s')",
                        values[0], values[1],values[2]);
                statement.executeUpdate(sql);
            }
            
            */




        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error.");
            e.printStackTrace();
        }
    }
    
    
    
}