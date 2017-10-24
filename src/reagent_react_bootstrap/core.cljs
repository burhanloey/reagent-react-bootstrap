(ns reagent-react-bootstrap.core
  (:require [reagent.core :as r]
            [reagent-react-bootstrap.buttons.component :refer [buttons]]))

(defonce app-state (r/atom {}))

(defn components []
  [:div
   [buttons]])

(r/render [components] (js/document.getElementById "app"))

(defn on-js-reload []
  )
