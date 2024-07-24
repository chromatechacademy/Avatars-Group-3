Feature: Admit Multiple Students

  #@Regression @Kei @AG3CP-19
  Scenario Outline: Admitting Multiple Students
    Given a user is on the Chroma Tech Academy practice site "https://mexil.it/chroma/site/login"
    And user enters username "general@teacher.com" in username text box
    And enters password "123456" in password text box
    And clicks on Sign In button
    And user is directed to the CTSMS dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    And verifies a student with "<Admission No>" is not an existing student
    And verifies a sibling with "112358132134" is not an existing student
    And creates a test category "<Category>"
    When a CTSMS admin or faculty member is on the student admission page "https://mexil.it/chroma/student/create"
    And creates a test sibling with admission number "112358132134", class "SDET", section "Cucumber Fundamentals", first name "Group Three Sibling", gender "Female", date of birth "03/03/1993", guardian name "Group Three Guardian", guardian phone number "3333333333"
    And adds a sibling
    And the user fills out all fields "<Admission No>", "<Roll Number>", "<Class>", "<Section>", "<First Name>", "<Last Name>", "<Gender>", "<Date of Birth>", "<Category>", "<Email>", "<Admission Date>", "<Blood Group>", "<As on Date>", "<Mobile Number>", "<Height>", "<Weight>", "<Father Name>", "<Father Phone>", "<Father Occupation>", "<Mother Name>", "<Mother Phone>", "<Mother Occupation>", "<Guardian Email>", "<Guardian Address>"
    And uploads family member photos
    And clicks the Add More Details button
    And adds Student Address Details
    And adds Miscellaneous Details "<Bank Account Number>", "<Bank Name>", "<IFSC Code>", "<National Identification Number>", "<Local Identification Number>", "<Previous School Details>", "<Note>"
    And uploads documents "<Title 1>", "<Title 2>", "<Title 3>", "<Title 4>"
    And clicks save
    Then the user should be able to admit students with unique admission numbers "<Class>", "<Section>", "<Admission No>"
    And delete test account with "<Admission No>"
    And delete test sibling account with admission number "112358132134"
    And delete the test category

    Examples:
      | Admission No | Roll Number | Class | Section               | First Name | Last Name  | Gender | Date of Birth | Category | Email                        | Admission Date | Blood Group | As on Date | Mobile Number | Height | Weight | Father Name     | Father Phone | Father Occupation   | Mother Name        | Mother Phone  | Mother Occupation | Guardian Email               | Guardian Address       | Bank Account Number | Bank Name           | IFSC Code | National Identification Number | Local Identification Number | Previous School Details                                      | Note                                                                                                                                                                               | Title 1 | Title 2     | Title 3 | Title 4     |
      | 1001954230   | 201333333   | SDET  | Cucumber Fundamentals | John       | Doe        | Male   | 10/27/2020    | Selenium | john.doe01@example.com       | 09/11/1998     | O+          | 01/02/1990 | 1001001100    | 170 cm | 60 kg  | Michael Doe     | 1002002100   | Engineer            | Jane Doe           | 1003003100    | Teacher           | bruce.wayne@example.com      | 100 Wayne Manor        | 314438451           | Amberley            | 56229     | 859694896                      | 1266164692                  | Dictionary St 2883, Owerri, Georgia, 891349                  | Youth hearing memories packed engineering grow thai, candidate easy lisa.                                                                                                          | Brother | Sister      | Dog     | Grandmother |
      | 1002954230   | 202333333   | SDET  | Cucumber Fundamentals | Jane       | Smith      | Male   | 09/12/2008    | Selenium | jane.smith02@example.com     | 06/15/1995     | O+          | 01/02/1990 | 1002002200    | 160 cm | 55 kg  | Robert Smith    | 1002100210   | Doctor              | Mary Smith         | 10022102200   | Nurse             | clark.kent@example.com       | 200 Kent Farm          | 1437603667          | Eugenie Goldschmidt | 3430      | 1163275127                     | 1530604284                  | Pet Road 33, Sainte Genevieve, Palestinian Territory, 812624 | Maintained modified horror harrison immediately updates want, weather belarus address laundry auto solo dawn, lovely pee legal restructuring witnesses level gently, cities tuner. | Sister  | Brother     | Dog     | Grandmother |
      | 1003954230   | 203333333   | SDET  | Cucumber Fundamentals | Mike       | Johnson    | Female | 11/09/1997    | Selenium | mike.johnson03@example.com   | 06/14/2016     | O+          | 01/02/1990 | 1003003300    | 165 cm | 58 kg  | William Johnson | 1002220230   | Architect           | Patricia Johnson   | 10023303300   | Designer          | diana.prince@example.com     | 300 Themyscira Island  | 654763729           | Andru Mullane       | 5821      | 657376054                      | 1292011071                  | Spencer Road 4668, Bethesda, Yugoslavia, 825841              | Dutch visited tournaments engineering gathering delayed activated, accountability intervention collaborative guided.                                                               | Sister  | Brother     | Dog     | Grandfather |
      | 1020954230   | 220333333   | SDET  | Cucumber Fundamentals | Sam        | Thompson   | Male   | 07/22/1993    | Selenium | sam.thompson20@example.com   | 07/26/1982     | O+          | 01/02/1990 | 1002000220    | 175 cm | 62 kg  | Daniel Thompson | 1002002022   | Chef                | Nancy Thompson     | 1002200202200 | Banker            | oliver.queen@example.com     | 900 Star City          | 1662148858          | Catina Lubin        | 612092    | 1746874341                     | 1378415022                  | Yield Street 2631, Colgate, Burma, 969288                    | Costume popularity related me alexander.                                                                                                                                           | Brother | Grandmother | Dog     | Grandfather |
      | 1021954230   | 221333333   | SDET  | Cucumber Fundamentals | Emily      | Johnson    | Female | 07/21/1989    | Selenium | emily.johnson21@example.com  | 06/06/1981     | O+          | 01/02/1990 | 1002100210    | 165 cm | 53 kg  | Mark Johnson    | 1002210220   | Lawyer              | Lisa Johnson       | 10023202300   | Pharmacist        | barry.allen@example.com      | 221 Central City       | 1365764592          | Austyn Braud        | 60107     | 1583256890                     | 1902892011                  | Pipe Street 965, Adamsburg, Argentina, 477911                | Gaps celtic miles graduates secured william pastor, main recently toolbar a employed approx academy, venezuela dreams ambassador cable affecting.                                  | Brother | Sister      | Dog     | Grandfather |
      | 1022954230   | 222333333   | SDET  | Cucumber Fundamentals | Daniel     | Brown      | Female | 06/17/1990    | Selenium | daniel.brown22@example.com   | 05/21/1975     | O+          | 01/02/1990 | 1002220220    | 175 cm | 62 kg  | James Brown     | 1002330230   | Geologist           | Sarah Brown        | 10024402400   | Anthropologist    | john.constantine@example.com | 222 New Castle         | 1079058380          | Dante Goldschmidt   | 8532834   | 305796875                      | 213746521                   | Lived Street 5107, Lagoa, Thailand, 344783                   | Hospitals paid conflict ink classified things horn, social approximate modeling astrology midi lean slide, capability.                                                             | Sister  | Brother     | Dog     | Grandmother |
      | 1023954230   | 223333333   | SDET  | Cucumber Fundamentals | Jessica    | Joy        | Male   | 05/28/2001    | Selenium | jessica.joy23@example.com    | 02/23/2023     | O+          | 01/02/1990 | 1002330230    | 163 cm | 57 kg  | David Joy       | 1002440240   | Psychologist        | Emma Joy           | 10025502500   | Librarian         | arthur.curry@example.com     | 223 Atlantis           | 1273826489          | Rhonda Hemingway    | 110598    | 464961346                      | 2016990820                  | Anne St 9495, Joshua Tree, Czech Republic, 917598            | Safe nsw aim strongly chances mentor defendant, unwrap active acid constitution aggregate obesity precious, jeep diagnosis.                                                        | Brother | Sister      | Dog     | Grandfather |
      | 1024954230   | 224333333   | SDET  | Cucumber Fundamentals | Jack       | Miller     | Female | 05/14/1990    | Selenium | jack.miller24@example.com    | 06/08/2010     | O+          | 01/02/1990 | 1002440240    | 177 cm | 65 kg  | Paul Miller     | 1002550250   | Zoologist           | Helen Miller       | 10026602600   | Psychiatrist      | slade.wilson@example.com     | 224 Deathstroke Street | 395500008           | Greggory Desimone   | 11422333  | 327612106                      | 1250678175                  | Genes St 648, Mercara, Montenegro, 587378                    | Awesome creek jets toys msie terrible yukon, assignments professionals.                                                                                                            | Sister  | Brother     | Dog     | Grandmother |
      | 1025954230   | 225333333   | SDET  | Cucumber Fundamentals | Rachel     | Le         | Female | 11/23/2015    | Selenium | rachel.le25@example.com      | 12/28/1989     | O+          | 01/02/1990 | 1002550250    | 158 cm | 52 kg  | Harry Le        | 1002660260   | Botanist            | Lucy Le            | 10027702700   | Mathematician     | ronnie.raymond@example.com   | 225 Central Park       | 1395859786          | Shalaya Durst       | 702821737 | 39258511                       | 1151927161                  | Rachel St 6617, Rowe, Burma, 876256                          | Default periodically carbon jones displayed continues arms, goes rim auckland city preparing savings naples, receptor lions item cohen seems stream due.                           | Brother | Sister      | Dog     | Grandmother |
      | 1026954230   | 226333333   | SDET  | Cucumber Fundamentals | Robert     | Moreau     | Male   | 01/04/1972    | Selenium | robert.moreau26@example.com  | 12/07/2017     | O+          | 01/02/1990 | 1002660260    | 180 cm | 68 kg  | Patrick Moreau  | 1002770270   | Chemist             | Claire Moreau      | 10028802800   | Economist         | ray.palmer@example.com       | 226 Ivy Town           | 20527454            | Lilli Rider         | 567333600 | 1244607612                     | 175036736                   | Holding Road 9487, Dix, The Bahamas, 529231                  | Ends striking closure marathon.                                                                                                                                                    | Sister  | Brother     | Dog     | Grandfather |
      | 1027954230   | 227333333   | SDET  | Cucumber Fundamentals | Kim        | Nguyen     | Female | 12/01/1994    | Selenium | kim.nguyen27@example.com     | 01/03/1976     | O+          | 01/02/1990 | 1002770270    | 160 cm | 55 kg  | Thomas Nguyen   | 1002880280   | Biologist           | Sophia Nguyen      | 10029902900   | Sociologist       | bart.allen@example.com       | 227 Star Labs          | 1317139845          | Darus Bowes         | 110813617 | 1505604020                     | 1980466843                  | Horizon Road 2216, Monterville, Guernsey, 894349             | Everywhere sisters interest computers employees rally unit, prophet declined representation evening boxing order clicks, dim.                                                      | Sister  | Brother     | Dog     | Grandmother |
      | 1028954230   | 228333333   | SDET  | Cucumber Fundamentals | Emma       | Morozov    | Male   | 06/12/1984    | Selenium | emma.morozov28@example.com   | 03/12/2023     | O+          | 01/02/1990 | 1002880280    | 161 cm | 53 kg  | Ivan Morozov    | 1002990290   | Physicist           | Elena Morozov      | 10030003000   | Philosopher       | wally.west@example.com       | 228 Keystone City      | 1595807165          | Katarina Lingerfelt | 419475838 | 621940673                      | 1827351313                  | Segment St 3591, Seekonk, The Gambia, 914524                 | Massachusetts vault solomon subsequently teacher plots cannon, territories palestinian rand centre answering healthcare only.                                                      | Brother | Sister      | Dog     | Grandmother |
      | 1029954230   | 229333333   | SDET  | Cucumber Fundamentals | Michael    | Park       | Female | 01/17/2016    | Selenium | michael.park29@example.com   | 09/06/2019     | O+          | 01/02/1990 | 1002990290    | 172 cm | 60 kg  | Kevin Park      | 1003000300   | Journalist          | Linda Park         | 10031103100   | Dentist           | jay.garrick@example.com      | 229 Central City       | 1481019678          | Nayeli Philpot      | 479684697 | 829013350                      | 1635355760                  | Precipitation Street 5808, Star Lake, Finland, 064648        | Studio saddam thin petroleum small intensive dame.                                                                                                                                 | Brother | Sister      | Dog     | Grandmother |
      | 1030954230   | 230333333   | SDET  | Cucumber Fundamentals | Olivia     | Li         | Male   | 07/24/1988    | Selenium | olivia.li30@example.com      | 02/14/1980     | O+          | 01/02/1990 | 1003000300    | 154 cm | 50 kg  | Peter Li        | 1003110310   | Mathematician       | Lily Li            | 10032203200   | Architect         | vic.stone@example.com        | 230 S.T.A.R Labs       | 787404426           | Waymond Richins     | 31442500  | 127751582                      | 478987530                   | Officers Street 5652, Pabrade, Seychelles, 717501            | Bachelor everyday from wisdom arrangements refused case, context speak processor peoples frequency luxembourg pat, stewart.                                                        | Brother | Sister      | Dog     | Grandfather |
      | 1031954230   | 231333333   | SDET  | Cucumber Fundamentals | Ethan      | Yoo        | Female | 11/06/1972    | Selenium | ethan.yoo31@example.com      | 09/30/2003     | O+          | 01/02/1990 | 1003110310    | 176 cm | 67 kg  | Ben Yoo         | 1003220320   | Historian           | Jenny Yoo          | 10033303300   | Physicist         | nightwing@example.com        | 231 Bludhaven          | 1517471767          | Rolf Bangs          | 798161833 | 1029333325                     | 923555334                   | Widespread Street 37, Hurtsboro, Norfolk Island, 861724      | Fly albania selection axis worked functionality perspective, aging danish hon toward tenant thread venice, exterior initiatives magic membership cardiovascular carmen vary.       | Sister  | Brother     | Dog     | Grandfather |
      | 1032954230   | 232333333   | SDET  | Cucumber Fundamentals | Ava        | Rossi      | Female | 03/01/1994    | Selenium | ava.rossi01@example.com      | 05/18/1997     | O+          | 01/02/1990 | 1003220320    | 165 cm | 54 kg  | Fabio Rossi     | 1003330330   | Composer            | Anna Rossi         | 10034403400   | Novelist          | tim.drake@example.com        | 232 Gotham City        | 452545216           | Devita Maskell      | 436901948 | 1198609827                     | 693868017                   | Pressed Road 2008, Tallahassee, Yugoslavia, 732772           | Leeds cash trash outstanding advised conferences girls, others mercury hardwood memphis offered bird step, recorder were reserve guests alike dragon pink, provides israel joins.  | Brother | Sister      | Dog     | Grandmother |
      | 1033954230   | 233333333   | SDET  | Cucumber Fundamentals | Logan      | Patel      | Male   | 12/03/2008    | Selenium | logan.patel02@example.com    | 09/14/1998     | O+          | 01/02/1990 | 1003330330    | 174 cm | 63 kg  | Raj Patel       | 1003440340   | Mechanical engineer | Meena Patel        | 10035503500   | Biochemist        | jason.todd@example.com       | 233 Wayne Tech         | 40090026            | Noemy Channel       | 753274429 | 889709965                      | 1601222898                  | Wikipedia St 81, Bororen, Palau, 725178                      | Merger regime removal resolution quebec importantly preservation.                                                                                                                  | Brother | Sister      | Dog     | Grandmother |
      | 1034954230   | 234333333   | SDET  | Cucumber Fundamentals | Sophia     | Lo         | Female | 09/19/2017    | Selenium | sophia.lo03@example.com      | 02/19/2024     | O+          | 01/02/1990 | 1003440340    | 167 cm | 56 kg  | Max Lo          | 1003550350   | Electrical engineer | Fiona Lo           | 10036603600   | Geneticist        | bruce.wayne01@example.com    | 234 Wayne Enterprises  | 653281387           | Aubrie Gerlach      | 421585359 | 943752214                      | 1803591338                  | Cho St 6905, Beaver Island, United Kingdom, 452088           | Rays mediterranean casio approve topic manor lamb, palestine starts builds expressions curtis magical historical, president outreach anna transmit did officials limousines.       | Brother | Sister      | Dog     | Grandfather |
      | 1035954230   | 235333333   | SDET  | Cucumber Fundamentals | Alexander  | Kim        | Male   | 10/17/1991    | Selenium | alexander.kim04@example.com  | 08/03/2006     | O+          | 01/02/1990 | 1003550350    | 178 cm | 69 kg  | Sam Kim         | 1003660360   | Statistician        | Bella Kim          | 10037703700   | Physiologist      | clark.kent01@example.com     | 235 Kent Farm          | 672430877           | Herby Dinardo       | 49160160  | 1078901794                     | 1687536956                  | Studio Street 2160, Likely, Dominican Republic, 634721       | Chronicle symbols women possibly joining european auto, answer collectible rings opened hiv parker thousands, cedar chose shipment gazette audio michel bookmark.                  | Brother | Sister      | Dog     | Grandmother |
      | 1036954230   | 236333333   | SDET  | Cucumber Fundamentals | Mia        | Bakhmutova | Female | 05/16/1986    | Selenium | mia.bakhmutova05@example.com | 06/14/1989     | O+          | 01/02/1990 | 1003660360    | 162 cm | 58 kg  | Igor Bakhmutova | 1003770370   | Rocket scientist    | Natalya Bakhmutova | 10038803800   | Surgeon           | oliver.queen01@example.com   | 236 Star City          | 1299818237          | Lindsee Lindeman    | 69197660  | 1350332836                     | 1093348293                  | Enterprise Road 8817, Poolesville, Cambodia, 593479          | Wishlist seeds alternatively bulgaria failure purchasing.                                                                                                                          | Brother | Sister      | Dog     | Grandmother |

  #@Regression @Kei @AG3CP-12
  Scenario Outline: Admitting One Student
    Given a user is on the Chroma Tech Academy practice site "https://mexil.it/chroma/site/login"
    And user enters username "general@teacher.com" in username text box
    And enters password "123456" in password text box
    And clicks on Sign In button
    And user is directed to the CTSMS dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    And verifies a student with "<Admission No>" is not an existing student
    And verifies a sibling with "112358132134" is not an existing student
    And creates a test category "<Category>"
    When a CTSMS admin or faculty member is on the student admission page "https://mexil.it/chroma/student/create"
    And creates a test sibling with admission number "112358132134", class "SDET", section "Cucumber Fundamentals", first name "Group Three Sibling", gender "Female", date of birth "03/03/1993", guardian name "Group Three Guardian", guardian phone number "3333333333"
    And adds a sibling
    And the user fills out all fields "<Admission No>", "<Roll Number>", "<Class>", "<Section>", "<First Name>", "<Last Name>", "<Gender>", "<Date of Birth>", "<Category>", "<Email>", "<Admission Date>", "<Blood Group>", "<As on Date>", "<Mobile Number>", "<Height>", "<Weight>", "<Father Name>", "<Father Phone>", "<Father Occupation>", "<Mother Name>", "<Mother Phone>", "<Mother Occupation>", "<Guardian Email>", "<Guardian Address>"
    And uploads family member photos
    And clicks the Add More Details button
    And adds Student Address Details
    And adds Miscellaneous Details "<Bank Account Number>", "<Bank Name>", "<IFSC Code>", "<National Identification Number>", "<Local Identification Number>", "<Previous School Details>", "<Note>"
    And uploads documents "<Title 1>", "<Title 2>", "<Title 3>", "<Title 4>"
    And clicks save
    Then the user should be able to admit students with unique admission numbers "<Class>", "<Section>", "<Admission No>"
    And delete test account with "<Admission No>"
    And delete test sibling account with admission number "112358132134"
    And delete the test category

    Examples:
      | Admission No | Roll Number | Class | Section               | First Name | Last Name | Gender | Date of Birth | Category | Email                        | Admission Date | Blood Group | As on Date | Mobile Number | Height | Weight | Father Name    | Father Phone | Father Occupation | Mother Name    | Mother Phone | Mother Occupation | Guardian Email     | Guardian Address | Bank Account Number | Bank Name | IFSC Code | National Identification Number | Local Identification Number | Previous School Details                 | Note                                | Title 1 | Title 2 | Title 3 | Title 4     |
      | 1260225082   | 237333333   | SDET  | Cucumber Fundamentals | Winston    | Sir       | Male   | 07/19/2010    | Selenium | shardey_uchidae@hawaiian.fpl | 05/22/1985     | O+          | 02/16/2014 | 1003770370    | 144 cm | 44 kg  | Lewis Hamilton | 1000440440   | F1 Driver         | Logan Browning | 1000420421   | Actress           | lewis.ham@f1.email | 120 Frank Street | 31425451            | Progress  | 2234202   | 81314296                       | 134323422                   | Berger St 2321, Duston, Alabama, 812349 | Computers earnings jerry cigarette. | Brother | Sister  | Dog     | Grandmother |