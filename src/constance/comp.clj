(ns constance.comp
  "Constant time comparison functions. Use when needing to avoid
   timing attacks. See: http://codahale.com/a-lesson-in-timing-attacks/")

(defn ^Boolean constant=
  "An iterative, constant-time comparison function for byte-arrays"
  [^"[B" e1 ^"[B" e2]
  (and (boolean e1)
       (boolean e2)
       (= (count e1) (count e2))
       (zero? (reduce bit-or 0 (map bit-xor e1 e2)))))

(defn ^Boolean constant-string=
  "An iterative, constant-time comparison function for strings"
  [^String s1 ^String s2]
  (and (boolean s1)
       (boolean s2)
       (constant= (.getBytes s1) (.getBytes s2))))

(def === constant-string=)
(def b=== constant=)
