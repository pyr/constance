# constance

A clojure library offering constant time comparison functions, to avoid timing attacks.
If you're interested in the purpose of this library, I'd recommend reading this:
http://codahale.com/a-lesson-in-timing-attacks/

## Usage

You'll need to get the following artifacts:

```
[org.spootnik/constance "0.5.0"]
```

```clojure
(constant-string= "foo" "bar")
;; false
(constant-string= "foo" "foo")
;; true
(constant= (.getBytes "h") (.getBytes "a"))
;; false
```

## License

Copyright © 2014 Pierre-Yves Ritschard

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
