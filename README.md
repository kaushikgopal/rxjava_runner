This is a dead simple java project that uses gradle.

The objective is to use this as a playground of sorts when trying to understand the working of [different operators in RxJava](https://github.com/ReactiveX/RxJava/wiki/Alphabetical-List-of-Observable-Operators).

# Installation:

1. you need to have gradle installed.
  * `brew install gradle` is the simplest way to go if you use homebrew.

2. the [example](https://github.com/ReactiveX/RxJava/issues/1176) uses java 8 so make sure your path variable `JAVA_HOME` points to a valid jre/jdk 8 installation.
  * if you have [cask](http://caskroom.io/) installed, `cask install java` is a super easy way to go.

3. if you run `gradle run`, you should see an output like follows:

<!-- code -->

    gradle run
    :compileJava
    :processResources UP-TO-DATE
    :classes
    :run
    Hello World!
    ---- 3
    ---- 5
    ---- 7
    ---- 9
    ---- 100
    ---- 101
    ---- 102
    ---- 103
    ---- 104

    BUILD SUCCESSFUL

    Total time: 1.397 secs
