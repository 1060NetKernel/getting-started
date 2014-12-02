getting-started
===============

A repository with some modules to show how to get started with [NetKernel](http://www.1060research.com/netkernel/)

Requirements
------------

All you need is a copy of [gradle](http://gradle.org/)

Getting Started with Getting Started
------------------------------------

* Clone this git repository
* Go to **module/urn.org.netkernel.helloworld/**

* To build this module

<code>gradle build</code>

* To download NetKernel, install NetKernel, deploy this project's module and start NetKernel...

<code>gradle installNK deployModuleNK startNK</code>

* Congratulations you have your first module installed, try it [here](http://localhost:8080/getting-started/helloworld)
* To stop NetKernel...

<code>gradle stopNK</code>

Where was NetKernel Installed?
------------------------------

* You installed a copy of NetKernel with your module running in the relative directory **../NKSE-5.2.1/**
* To start NetKernel manually use **../NKSE-5.2.1/bin/netkernel.sh**  (or netkernel.bat if you're on Windows)
* To see the console output of NetKernel look at **../NKSE-5.2.1/log/netkernel.out**
* To delete this temporary copy of NetKernel use

<code>gradle cleanNK</code>

You can tell *Gradle* to use an existing copy of NetKernel. Just open **build.gradle** and change *location* to point to the directory where your existing copy of NetKernel lives.

Eclipse
-------

To start playing with the code in Eclipse run to create Eclipse's .project and .classpath files...

<code>gradle eclipse</code>

Now in Eclipse just use **"Import..."** and point to the directory as an Eclipse project

Next Steps with NetKernel
-------------------------

* We *highly recommend* that you go to the built-in [package manager](http://localhost:1060/tools/apposite/) (referred to as the "Apposite" tool) and accept all updates.
* Click "Select All Updates"
* Then click "Apply Selections"
* Wait a few moments for the updates to be downloaded and for NK to hot deploy.

* To start learning all about NetKernel and Resource Oriented Computing go to the [documentation](http://localhost:1060/book/view/book:readme/)


NetKernel Gradle Plugin
-----------------------

As well as building a project, there are lots of powerful things you can do with the NetKernel Gradle plugin.

A detailed guide is provide [here](http://wiki.netkernel.org/wink/wiki/NetKernel/News/5/12/October_3rd_2014#NetKernel_Gradle_Plugin:_Build_Automation_Tooling_for_ROC)


*Last Edited, Peter Rodgers, 2014-12-02*
