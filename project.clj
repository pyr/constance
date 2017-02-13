(defproject spootnik/constance "0.5.4-SNAPSHOT"
  :description "constant time comparison"
  :url "https://github.com/pyr/constance"
  :license {:name "MIT License"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]]
  :profiles {:dev {:dependencies [[org.clojure/test.check "0.6.2"]]
                   :global-vars {*warn-on-reflection* true}}})
