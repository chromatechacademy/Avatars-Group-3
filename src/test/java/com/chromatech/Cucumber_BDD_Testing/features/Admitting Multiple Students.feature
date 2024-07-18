Feature: Admitting Multiple Records

  @Regression @Kei
  Scenario Outline: Making and saving changes to student information records
    Given a user is on the Chroma Tech Academy practice site "https://mexil.it/chroma/site/login"
    And user enters username "general@teacher.com" in username text box
    And enters password "123456" in password text box
    And clicks on Sign In button
    And user is directed to the CTSMS dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When a CTSMS admin or faculty member is on the student admission page "https://mexil.it/chroma/student/create"
    And the user fills out all fields "<Admission No>", "<Roll Number>", "<Class>", "<Section>", "<First Name>", "<Last Name>", "<Gender>", "<Date of Birth>", "<Category>", "<Email>", "<Admission Date>", "<Blood Group>", "<As on Date>", "<Mobile Number>", "<Height>", "<Weight>", "<Father Name>", "<Father Phone>", "<Father Occupation>", "<Mother Name>", "<Mother Phone>", "<Mother Occupation>", "<Guardian Name>", "<Guardian Email>", "<Guardian Phone>", "<Guardian Occupation>", "<Guardian Address>"
    And uploads family member photos
    And clicks the Add More Details button
    And adds Student Address Details
    And adds Miscellaneous Details
    And uploads documents
    And clicks save
    Then the user should be able to admit multiple students with unique admission numbers
    Examples:
      | Admission No | Roll Number | Class | Section               | First Name | Last Name  | Gender | Date of Birth | Category | Email                        | Admission Date | Blood Group | As on Date | Mobile Number | Height | Weight | Father Name     | Father Phone | Father Occupation   | Mother Name        | Mother Phone  | Mother Occupation | Guardian Name    | Guardian Email               | Guardian Phone | Guardian Occupation | Guardian Address       |
      | 1001954230   | 201         | SDET  | Cucumber Fundamentals | John       | Doe        | Male   | 10/27/2020    | Selenium | john.doe01@example.com       | 09/11/1998     | O+          | 01/02/1990 | 1001001100    | 170 cm | 60 kg  | Michael Doe     | 1002002100   | Engineer            | Jane Doe           | 1003003100    | Teacher           | Bruce Wayne      | bruce.wayne@example.com      | 1004004100     | Entrepreneur        | 100 Wayne Manor        |
      | 1002954230   | 202         | SDET  | Cucumber Fundamentals | Jane       | Smith      | Male   | 09/12/2008    | Selenium | jane.smith02@example.com     | 06/15/1995     | O+          | 01/02/1990 | 1002002200    | 160 cm | 55 kg  | Robert Smith    | 1002100210   | Doctor              | Mary Smith         | 10022102200   | Nurse             | Clark Kent       | clark.kent@example.com       | 1002320320     | Journalist          | 200 Kent Farm          |
      | 1003954230   | 203         | SDET  | Cucumber Fundamentals | Mike       | Johnson    | Female | 11/09/1997    | Selenium | mike.johnson03@example.com   | 06/14/2016     | O+          | 01/02/1990 | 1003003300    | 165 cm | 58 kg  | William Johnson | 1002220230   | Architect           | Patricia Johnson   | 10023303300   | Designer          | Diana Prince     | diana.prince@example.com     | 1002440440     | Art dealer          | 300 Themyscira Island  |
      | 1020954230   | 220         | SDET  | Cucumber Fundamentals | Sam        | Thompson   | Male   | 07/22/1993    | Selenium | sam.thompson20@example.com   | 07/26/1982     | O+          | 01/02/1990 | 1002000220    | 175 cm | 62 kg  | Daniel Thompson | 1002002022   | Chef                | Nancy Thompson     | 1002200202200 | Banker            | Oliver Queen     | oliver.queen@example.com     | 1002020020     | Mayor               | 900 Star City          |
      | 1021954230   | 221         | SDET  | Cucumber Fundamentals | Emily      | Johnson    | Female | 07/21/1989    | Selenium | emily.johnson21@example.com  | 06/06/1981     | O+          | 01/02/1990 | 1002100210    | 165 cm | 53 kg  | Mark Johnson    | 1002210220   | Lawyer              | Lisa Johnson       | 10023202300   | Pharmacist        | Barry Allen      | barry.allen@example.com      | 10024302400    | Forensic scientist  | 221 Central City       |
      | 1022954230   | 222         | SDET  | Cucumber Fundamentals | Daniel     | Brown      | Female | 06/17/1990    | Selenium | daniel.brown22@example.com   | 05/21/1975     | O+          | 01/02/1990 | 1002220220    | 175 cm | 62 kg  | James Brown     | 1002330230   | Geologist           | Sarah Brown        | 10024402400   | Anthropologist    | John Constantine | john.constantine@example.com | 10025502500    | Exorcist            | 222 New Castle         |
      | 1023954230   | 223         | SDET  | Cucumber Fundamentals | Jessica    | Joy        | Male   | 05/28/2001    | Selenium | jessica.joy23@example.com    | 02/23/2023     | O+          | 01/02/1990 | 1002330230    | 163 cm | 57 kg  | David Joy       | 1002440240   | Psychologist        | Emma Joy           | 10025502500   | Librarian         | Arthur Curry     | arthur.curry@example.com     | 10026602600    | Biologist           | 223 Atlantis           |
      | 1024954230   | 224         | SDET  | Cucumber Fundamentals | Jack       | Miller     | Female | 05/14/1990    | Selenium | jack.miller24@example.com    | 06/08/2010     | O+          | 01/02/1990 | 1002440240    | 177 cm | 65 kg  | Paul Miller     | 1002550250   | Zoologist           | Helen Miller       | 10026602600   | Psychiatrist      | Slade Wilson     | slade.wilson@example.com     | 10027702700    | Mercenary           | 224 Deathstroke Street |
      | 1025954230   | 225         | SDET  | Cucumber Fundamentals | Rachel     | Le         | Female | 11/23/2015    | Selenium | rachel.le25@example.com      | 12/28/1989     | O+          | 01/02/1990 | 1002550250    | 158 cm | 52 kg  | Harry Le        | 1002660260   | Botanist            | Lucy Le            | 10027702700   | Mathematician     | Ronnie Raymond   | ronnie.raymond@example.com   | 10028802800    | Physicist           | 225 Central Park       |
      | 1026954230   | 226         | SDET  | Cucumber Fundamentals | Robert     | Moreau     | Male   | 01/04/1972    | Selenium | robert.moreau26@example.com  | 12/07/2017     | O+          | 01/02/1990 | 1002660260    | 180 cm | 68 kg  | Patrick Moreau  | 1002770270   | Chemist             | Claire Moreau      | 10028802800   | Economist         | Ray Palmer       | ray.palmer@example.com       | 10029902900    | Engineer            | 226 Ivy Town           |
      | 1027954230   | 227         | SDET  | Cucumber Fundamentals | Kim        | Nguyen     | Female | 12/01/1994    | Selenium | kim.nguyen27@example.com     | 01/03/1976     | O+          | 01/02/1990 | 1002770270    | 160 cm | 55 kg  | Thomas Nguyen   | 1002880280   | Biologist           | Sophia Nguyen      | 10029902900   | Sociologist       | Bart Allen       | bart.allen@example.com       | 10030003000    | Student             | 227 Star Labs          |
      | 1028954230   | 228         | SDET  | Cucumber Fundamentals | Emma       | Morozov    | Male   | 06/12/1984    | Selenium | emma.morozov28@example.com   | 03/12/2023     | O+          | 01/02/1990 | 1002880280    | 161 cm | 53 kg  | Ivan Morozov    | 1002990290   | Physicist           | Elena Morozov      | 10030003000   | Philosopher       | Wally West       | wally.west@example.com       | 10031103100    | Mechanic            | 228 Keystone City      |
      | 1029954230   | 229         | SDET  | Cucumber Fundamentals | Michael    | Park       | Female | 01/17/2016    | Selenium | michael.park29@example.com   | 09/06/2019     | O+          | 01/02/1990 | 1002990290    | 172 cm | 60 kg  | Kevin Park      | 1003000300   | Journalist          | Linda Park         | 10031103100   | Dentist           | Jay Garrick      | jay.garrick@example.com      | 10032203200    | Military physician  | 229 Central City       |
      | 1030954230   | 230         | SDET  | Cucumber Fundamentals | Olivia     | Li         | Male   | 07/24/1988    | Selenium | olivia.li30@example.com      | 02/14/1980     | O+          | 01/02/1990 | 1003000300    | 154 cm | 50 kg  | Peter Li        | 1003110310   | Mathematician       | Lily Li            | 10032203200   | Architect         | Vic Stone        | vic.stone@example.com        | 10033303300    | Computer Scientist  | 230 S.T.A.R Labs       |
      | 1031954230   | 231         | SDET  | Cucumber Fundamentals | Ethan      | Yoo        | Female | 11/06/1972    | Selenium | ethan.yoo31@example.com      | 09/30/2003     | O+          | 01/02/1990 | 1003110310    | 176 cm | 67 kg  | Ben Yoo         | 1003220320   | Historian           | Jenny Yoo          | 10033303300   | Physicist         | Nightwing        | nightwing@example.com        | 10034403400    | Detective           | 231 Bludhaven          |
      | 1032954230   | 232         | SDET  | Cucumber Fundamentals | Ava        | Rossi      | Female | 03/01/1994    | Selenium | ava.rossi01@example.com      | 05/18/1997     | O+          | 01/02/1990 | 1003220320    | 165 cm | 54 kg  | Fabio Rossi     | 1003330330   | Composer            | Anna Rossi         | 10034403400   | Novelist          | Tim Drake        | tim.drake@example.com        | 10035503500    | Detective           | 232 Gotham City        |
      | 1033954230   | 233         | SDET  | Cucumber Fundamentals | Logan      | Patel      | Male   | 12/03/2008    | Selenium | logan.patel02@example.com    | 09/14/1998     | O+          | 01/02/1990 | 1003330330    | 174 cm | 63 kg  | Raj Patel       | 1003440340   | Mechanical engineer | Meena Patel        | 10035503500   | Biochemist        | Jason Todd       | jason.todd@example.com       | 10036603600    | Security Guard      | 233 Wayne Tech         |
      | 1034954230   | 234         | SDET  | Cucumber Fundamentals | Sophia     | Lo         | Female | 09/19/2017    | Selenium | sophia.lo03@example.com      | 02/19/2024     | O+          | 01/02/1990 | 1003440340    | 167 cm | 56 kg  | Max Lo          | 1003550350   | Electrical engineer | Fiona Lo           | 10036603600   | Geneticist        | Bruce Wayne      | bruce.wayne01@example.com    | 10037703700    | Businessman         | 234 Wayne Enterprises  |
      | 1035954230   | 235         | SDET  | Cucumber Fundamentals | Alexander  | Kim        | Male   | 10/17/1991    | Selenium | alexander.kim04@example.com  | 08/03/2006     | O+          | 01/02/1990 | 1003550350    | 178 cm | 69 kg  | Sam Kim         | 1003660360   | Statistician        | Bella Kim          | 10037703700   | Physiologist      | Clark Kent       | clark.kent01@example.com     | 10038803800    | Farmer              | 235 Kent Farm          |
      | 1036954230   | 236         | SDET  | Cucumber Fundamentals | Mia        | Bakhmutova | Female | 05/16/1986    | Selenium | mia.bakhmutova05@example.com | 06/14/1989     | O+          | 01/02/1990 | 1003660360    | 162 cm | 58 kg  | Igor Bakhmutova | 1003770370   | Rocket scientist    | Natalya Bakhmutova | 10038803800   | Surgeon           | Oliver Queen     | oliver.queen01@example.com   | 10039903900    | Mayor               | 236 Star City          |