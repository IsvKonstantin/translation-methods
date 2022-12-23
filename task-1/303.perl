$source = "";
 
while (<>) {
    $source = $source . $_;
}
 
@raw;
@links;
 
while ($source =~ /<(.*?)a(.*?)href(.*?)=(.*?)['"](.*?)['"].*?>/ig) {
    push (@raw, $5 . "!");
}
 
foreach (@raw) {
    if (/(\w+:\/\/)?(\w+.*?|)(:|\/|!)/) {
        if ($2 ne "") {
            push (@links, $2 . "\n");
        }
    }
}
 
%temp = map {$_, 1} @links;
@answer = keys %temp;
 
print sort @answer;