#!c:/perl/bin/perl.exe

local ($buffer, @pairs, $pair, $name, $value, %FORM);
# Read in text
$ENV{'REQUEST_METHOD'} =~ tr/a-z/A-Z/;

if ($ENV{'REQUEST_METHOD'} eq "GET") {
   $buffer = $ENV{'QUERY_STRING'};
}

# Split information into name/value pairs
@pairs = split(/&/, $buffer);

foreach $pair (@pairs) {
   ($name, $value) = split(/=/, $pair);
   $FORM{$name} = $value;
}

$name = $FORM{name};
$address  = $FORM{address};
$age=$FORM{age};

print "Content-type:text/html\r\n\r\n";
print "<html>";
print "<head>";
print "<title>Surv</title>";
print "</head>";
print "<body>";
print "<h2>Name is $name<br>Address is $address<br>Age is $age</h2>";
print "</body>";
print "</html>";

1;