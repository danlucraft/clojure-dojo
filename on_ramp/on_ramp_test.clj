(ns on-ramp-test
  (:use clojure.test))

(load "on_ramp/on_ramp")

; --- Define a simple arithmetic method
(deftest test-times2
  (is (= 24 (times2 12))))

;; --- Define a method that returns a closure/anonymous function
;(def add3 (adder 3))
;(def add4 (adder 4))
;
;(deftest test-adder
;  (is (= 7 (add3 4)))
;  (is (= 8 (add4 4))))

;; --- Define a method that filters a list
;(deftest test-positives
;  (is (= '(1 10 7) (positives '(-1 1 -8 -9 10 -4 7 0)))))

(run-tests)