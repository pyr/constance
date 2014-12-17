(ns org.spootnik.constance
  "Constant time comparison functions. Use when needing to avoid
   timing attacks.")

(defn ^Boolean constant=
  "An iterative, constant-time comparison function for byte-arrays"
  [^"[B" e1 ^"[B" e2]
  (boolean
   (when (= (count e1) (count e2))
     (loop [res        0
            elems     (count e1)
            [b1 & r1] (seq e1)
            [b2 & r2] (seq e2)]
       (if (pos? elems)
         (recur (bit-or res (bit-xor b1 b2)) (dec elems) r1 r2)
         (= res 0))))))

(defn ^Boolean constant-string=
  "An iterative, constant-time comparison function for strings"
  [^String s1 ^String s2]
  (constant= (.getBytes s1) (.getBytes s2)))
