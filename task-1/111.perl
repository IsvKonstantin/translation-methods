while (<>) {
    print if /^[\D]*(1(01*0)*1|0)+[\D]*$/;
}