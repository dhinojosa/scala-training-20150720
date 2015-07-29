val capitals = """Montgomery,Alabama
Juneau,Alaska
Phoenix,Arizona
Little Rock,Arkansas
Sacramento,California
Denver,Colorado
Hartford,Connecticut
Dover,Delaware
Tallahassee,Florida
Atlanta,Georgia
Honolulu,Hawaii
Boise,Idaho
Springfield,Illinois
Indianapolis,Indiana
Des Moines,Iowa
Topeka,Kansas
Frankfort,Kentucky
Baton Rouge,Louisiana
Augusta,Maine
Annapolis,Maryland
Boston,Massachusetts
Lansing,Michigan
Saint Paul,Minnesota
Jackson,Mississippi
Jefferson City,Missouri
Helena,Montana
Lincoln,Nebraska
Carson City,Nevada
Concord,New Hampshire
Trenton,New Jersey
Santa Fe,New Mexico
Albany,New York
Raleigh,North Carolina
Bismarck,North Dakota
Columbus,Ohio
Oklahoma City,Oklahoma
Salem,Oregon
Harrisburg,Pennsylvania
Providence,Rhode Island
Columbia,South Carolina
Pierre,South Dakota
Nashville,Tennessee
Austin,Texas
Salt Lake City,Utah
Montpelier,Vermont
Richmond,Virginia
Olympia,Washington
Charleston,West Virginia
Madison,Wisconsin
Cheyenne,Wyoming"""

//1. Parse the new line out of text
//2. Put into a List
//3. Split out the capital city using comma delimiter
//4. Find the predicate based on Regex likely using filter
//5. Return the city

val regex = """[^aeiouAEIOU ]{4}""".r
println(capitals.split("\n"). //Parse the news
        view.
        toList.               //Put into a List
        map(_.split(",").toList). //Split the capital city using comma
        map(_(0)).
        filter(regex.findAllIn(_).toList != Nil)(0)) //Find the pred.

println(capitals.split("\n"). //Parse the news
        view.
        toList.               //Put into a List
        map(_.split(",").toList). //Split the capital city using comma
        map(_(0)).
        filter(regex.findAllIn(_).toList != Nil)) //Find the pred.




