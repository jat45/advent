(ns advent.day-1
  (:require [advent.core :refer [read-input]]))

(defn
  f
  "the function to calculate the answer for day 1"
  [input]
  (loop [item input
         count 0]
    (if (empty? item)
      count
      (let [r (rest item)
            v (if (= "(" (str (first item))) 1 -1)]
            (recur r (+ count v))))))


(defn answer
  []
  (let [input (read-input "data/day-1")]
    (f input)))
