package abstractMethod.website;

import abstractMethod.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes php code for website...");
    }
}
