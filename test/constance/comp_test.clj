(ns constance.comp-test
  (:require [clojure.test.check              :as tc]
            [clojure.test.check.generators   :as gen]
            [clojure.test.check.properties   :as prop]
            [clojure.test.check.clojure-test :refer [defspec]]
            [clojure.test                    :refer :all]
            [constance.comp                  :refer :all]))

(deftest compares-with-nil
  (is (= (=== "" nil)
         false))
  (is (= (=== nil "")
         false))
  (is (= (b=== (byte-array 0) nil)
         false))
  (is (= (b=== nil (byte-array 0))
         false)))

(defspec always-equal-string
  1000
  (prop/for-all [s gen/string]
                (= true (=== s s))))

(defspec always-equal-bytes
  1000
  (prop/for-all [b gen/bytes]
                (= true (b=== b b))))
