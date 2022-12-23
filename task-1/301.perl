$leadingMode = "true";
$mergingMode = "false";

sub modifyAndPrint {
    $leadingMode = "false";
    
    $_ =~ s/^(\s)+//g;
    $_ =~ s/(\s)+$//g;
    $_ =~ s/(\s)+/ /g;

    print $_ . "\n";
}

while (<>) {
    if ($_ !~ /^(\s)*$/) {
        if ($mergingMode eq "true") {
            print "\n";
        }
        
        $mergingMode = "false";
        modifyAndPrint;
    } else {
        if ($leadingMode eq "false") {
            $mergingMode = "true";
        }
    }
}