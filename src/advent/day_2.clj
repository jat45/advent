(ns advent.day-2
  (:require [advent.core :refer [read-input]]
            [clojure.string :as str]))

(def rx #"x")

(defn parse-line
  [line]
  (let [[l w h ] (str/split line rx)]
    {:l (read-string l)
     :w (read-string w)
     :h (read-string h)}))

(defn wrapping-paper-required
  [{:keys [l w h] :as dimensions}]
  (let [areas [(* l w) (* w h) (* h l)]
        extra (apply min areas)
        surfaces (map (fn [x] (* 2 x)) areas)]
    (+ extra (reduce + surfaces))))

(defn f
  "the function to calculate the answer for day 2"
  [input]
  (let [dimensions (map parse-line input)
        paper (map wrapping-paper-required dimensions)]
    (reduce + paper)))

(defn answer
  []
  (let [input (read-input "data/day-2")]
    (f input)))
