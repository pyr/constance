(ns org.spootnik.constance-test
  (:require [clojure.test.check              :as tc]
            [clojure.test.check.generators   :as gen]
            [clojure.test.check.properties   :as prop]
            [clojure.test.check.clojure-test :refer [defspec]]
            [clojure.test                    :refer :all]
            [org.spootnik.constance          :refer :all]))

(defspec always-equal-string
  1000
  (prop/for-all [s gen/string]
                (= true (constant-string= s s))))

(defspec always-equal-bytes
  1000
  (prop/for-all [b gen/bytes]
                (= true (constant= b b))))
