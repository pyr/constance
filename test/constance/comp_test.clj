(ns constance.comp-test
  (:require [clojure.test.check              :as tc]
            [clojure.test.check.generators   :as gen]
            [clojure.test.check.properties   :as prop]
            [clojure.test.check.clojure-test :refer [defspec]]
            [clojure.test                    :refer :all]
            [constance.comp                  :refer :all]))

(defspec always-equal-string
  1000
  (prop/for-all [s gen/string]
                (= true (=== s s))))

(defspec always-equal-bytes
  1000
  (prop/for-all [b gen/bytes]
                (= true (b=== b b))))
