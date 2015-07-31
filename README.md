# constance

A clojure library offering constant time comparison functions, to avoid timing attacks.
If you're interested in the purpose of this library, I'd recommend reading this:
http://codahale.com/a-lesson-in-timing-attacks/

[![Build Status](https://travis-ci.org/pyr/constance.svg?branch=master)](https://travis-ci.org/pyr/constance)

## Usage

You'll need to get the following artifacts:

```
[spootnik/constance "0.5.3"]
```

Exposed functions

```clojure
(constant-string= "foo" "bar")
;; false
(constant-string= "foo" "foo")
;; true
(constant= (.getBytes "h") (.getBytes "a"))
;; false
```

Additionally, two aliases now exist:

```clojure
(=== "foo" "bar")
(b=== (.getBytes "h") (.getBytes "a"))
```

## License

Copyright © 2014, 2015 Pierre-Yves Ritschard

Distributed under the MIT License
