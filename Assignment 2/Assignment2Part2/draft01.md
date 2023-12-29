# Explaining the challenge to a beginner #

- **Joseph O'Keefe**
- **s2286607**
- **23**
- **Fiona McNeill**
- 2022-02-17

# Description #

Spoonerisms in Finnish is a challenge involving implementing an algorithm to
'spoonerise' Finnish words. Here, this involves taking two Finnish words,
and swapping the first part of each word (up until the first vowel) with the
other.

For example:

```
tarja halonen -> harja talonen
```

Here, in Finnish, vowels are ```a,e,i,o,u,y,ä,ö``` and consonants are
```bcdfghjklmnpqrstvwx```.

However, there are some special cases to be aware of:

*Long vowels* occur when the same vowel occurs consecutively, and these must
also be swapped along with the preceding vowel.

For example:

```blaane crock -> crone blaack```

Additionally, *vowel harmony* is another rule in Finnish whereby any of the
following vowels ```a,o,u``` should not be in the same word as the vowels
```ä,ö,y```, and here the first vowel takes precedence.

For example:

```köyhä kontti -> kouha köntti```

There are other special cases, but it is not required to consider these
(Finnish is a very complex language).

The challenge is to spoonerise two Finnish words using these rules.

# Original challenge question from codegolf #

[Short link to codegolf challenge](https://codegolf.stackexchange.com/questions/167513/spoonerise-words-in-finnish)



<STYLE>
* {
  font-size:   1rem;
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
  margin-top:  40px;
  padding-top: 10px;
  font-size: 1rem;
  }
</STYLE>
