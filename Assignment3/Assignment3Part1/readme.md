# Welcome to Assignment&nbsp;3 Part&nbsp;1

You may customise the `<STYLE>` section of this file to suit your
needs.

You may reformat the program code to your preferred style.

What matters most is that your code style is consistent.

## About this assignment ##

As well as teaching you coding and designing programs, this course is
also about preparing you for your second year, where concepts are
harder, assignments are larger, and there's much more reading
involved. One of your compulsory second year subjects is Software
Engineering and Assignment 2 was designed to partly prepare you for
that, through its Engineering Requirements, having accessibility as a
core part of design, and the focus on design rather than coding. This
delay in asking you to write code was also done to give beginners a
decent chance to get the hang of coding before being assessed on
coding skills.

So now welcome to Assignment&nbsp;3 which is going to make you code
some simpler but fundamentally critical tasks related to Data Science
in a Natural Language Processing (NLP) context. In this assignment it
is mainly pre-processing and processing a data set (vital work in Data
Science and Artificial Intelligence) and performing some simple but
useful and interesting operations on those data. (Note: "data" is
officially a plural word; "datum" is the singular)

Assignment&nbsp;3 is going to take your Java skills further by giving
you practice at Object-Oriented aspects of design and programming. As
you are still in the early days of using objects, Part&nbsp;1 of this
assignment is about making the components that are algorithmic and
thus have minimal need for objects. However principles of DRY
programming and loose coupling still apply.

Although you will be given new code for Part&nbsp;2, you will be able
to plug the algorithms from Part&nbsp;1 into that new code, albeit
with some adjustments. Thus Part&nbsp;2 will largely be about making
an object-oriented design out of components you are already familiar
with in an imperative paradigm context.

## Workload ##

The more you can do for Part&nbsp;1, in theory the less you will have
to do for Part&nbsp;2. However that depends on how well you do
Part&nbsp;1 not how much of it you do. Rushing into coding without
designing first will just make everything take longer and your code
may still be fundamentally flawed anyway.

## Feedback ##

Feedback for the code you edit or write and submit for
Assignment&nbsp;Part&nbsp;1 will be done in person as a "code review"
during a designated tutorial. So no attendance means no
feedback. Part&nbsp;1 is not graded but a lack of feedback can
seriously hurt your submission for Part&nbsp;2 and thus your grade.

## Task list ##

1. Read this file and understand what you need to do.
2. Look at `yourInput.txt` and `yourOutput.txt` to understand their
   potential roles; and work out how to have input read from and
   written to them as appropriate using `Run > Edit Configurations...`
   but you need to have run a program such as `Runner` at least once
   first before it appears in the configurations list.
3. Notice that the source code is in a package called `literature` and
   this has an effect on the first line of each Java file and where
   the source code lives. Using packages is a fundamental part of Java
   as it allows larger-scale software to be built in largely
   independent, self-contained chunks (this assignment is not large
   despite what you may think). Packages affect the way you call the
   Java code, so save yourself a lot of messing and run the code
   within `IntelliJ` using `Shift+F10` (`Shift+F9` for debugging) and
   not via the terminal.
4. Open the `TODO` tab at the bottom of the `IntelliJ` window.
5. If you find reading the TODOs difficult in the tab or source code,
   select them in the source code, use `Ctrl+W` to keep widening the
   selection until you have the entire `TODO` selected, then `Ctrl+C`
   to copy and paste into the `todo.md` file whose `<STYLE>` you can
   customise for your accessibility needs.
6. Start with `Runner.java` because that's how the program execution
   is started: you need a chunk of `Runner.java` working before you
   can realistically make progress with the other files.
7. You can do the remaining files in whatever order suits you: there
   is no requirement to finish any one file before moving onto another
   &mdash; indeed working through a process across files might be
   "better" than finishing one file at a time: it's up to you.
8. When working on `InputReader.java` make use of the provided input
   files of graded complexities in the `input` directory
9. Ensure you keep referring to
    1. the Code Quality and Conventions document provided with
       Assignment&nbsp;2 and
    2. the Java SE tutorial for how to use Java appropriately for
        1. input and output
        2. exceptions
        3. generics
        4. enums (enumerations)
10. Install the `UML Generator` plugin by Alessandro Caldonazzi and
    practice generating, rearranging, and saving diagrams with it:
    note you have to add the filename to the dialogue box line that
    says `folder name` otherwise your diagram won't save. This is an
    example of poor design because it is too easy for the user to make
    an error. Don't worry about understanding the technicalities and
    subtleties of UML diagrams (that's for another course) but do make
    use of them to visualise relationships between classes as practice
    for Part&nbsp;2 of the assignment where there will be more classes
    and relations between classes.
11. Completely optional extra that you should attempt if you feel you
    have "run out of things to do" for Part&nbsp;1: consider ways to
    time the execution speed of different classes in the Java
    collections. This is not required but it is useful. If you're
    interested but don't have time, you could look for others
    published results. However there is no substitute for doing some
    testing yourself so you feel you have understood it.

<STYLE>
* {
  font-size:   1.1rem;
  /*font-size:   1.2rem;*/
  background-color: #2A252A;
  color:            #D5DAD5;
  /*background-color: DarkSlateGray;*/
  /*color:            AntiqueWhite;*/
  /*background-color: black;*/
  /*color: white;*/
  /*background-color: white;*/
  /*color: black;*/
  }
  body {
  width: 80%;
  font-family: "OpenDyslexic", serif;
  /*font-family: sans-serif;*/
  line-height: 180%;
  /*line-height: 200%;*/
  }
  pre,
  code,
  pre code {
  font-family: "OpenDyslexicMono", monospace;
  line-height: 150%;
  }
  ol,
  ol ol,
  ol ol ol {
  list-style-type: decimal;
  }  
  em {
  font-style: normal;
  border-bottom-style: solid;
  border-bottom-width: 1px;
  padding-bottom:      2px;
  /*text-decoration: underline;*/
  text-decoration-skip-ink: auto;
  }
  h2 {
  border-top:  1px solid #D5DAD5;
  margin-top:  80px;
  padding-top: 20px;
  }
  </STYLE>