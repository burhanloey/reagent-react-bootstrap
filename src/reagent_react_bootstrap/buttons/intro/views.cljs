(ns reagent-react-bootstrap.buttons.intro.views
  (:require [reagent.core :as r]
            [cljsjs.react-bootstrap]
            [reagent-react-bootstrap.buttons.intro.snippets :refer [snippet]]
            [reagent-react-bootstrap.utils :refer [highlight-clojure]]))

(def button-toolbar (r/adapt-react-class (aget js/ReactBootstrap "ButtonToolbar")))
(def button         (r/adapt-react-class (aget js/ReactBootstrap "Button")))

(defn buttons-options []
  [:div
   [button-toolbar
    [button "Default"]
    [button {:bs-style "primary"} "Primary"]
    [button {:bs-style "success"} "Success"]
    [button {:bs-style "info"} "Info"]
    [button {:bs-style "warning"} "Warning"]
    [button {:bs-style "danger"} "Danger"]
    [button {:bs-style "link"} "Link"]]
   [highlight-clojure (:buttons-options snippet)]])

(defn buttons-sizes []
  [:div
   [:div
    [button-toolbar
     [button {:bs-style "primary" :bs-size "large"} "Large button"]
     [button {:bs-size "large"} "Large button"]]
    [button-toolbar
     [button {:bs-style "primary"} "Default button"]
     [button "Default button"]]
    [button-toolbar
     [button {:bs-style "primary" :bs-size "small"} "Small button"]
     [button {:bs-size "small"} "Small button"]]
    [button-toolbar
     [button {:bs-style "primary" :bs-size "xsmall"} "Extra small button"]
     [button {:bs-size "xsmall"} "Extra small button"]]]
   [highlight-clojure (:buttons-sizes snippet)]])

(defn buttons-active []
  [:div
   [button-toolbar
    [button {:bs-style "primary" :bs-size "large" :active true} "Primary button"]
    [button {:bs-size "large" :active true} "Button"]]
   [highlight-clojure (:buttons-active snippet)]])

(defn buttons-tags []
  [:div
   [button-toolbar
    [button {:href "#"} "Link"]
    [button "Button"]]
   [highlight-clojure (:buttons-tags snippet)]])

(defn buttons-disabled []
  [:div
   [button-toolbar
    [button {:bs-style "primary" :bs-size "large" :disabled true} "Primary button"]
    [button {:bs-size "large" :disabled true} "Button"]]
   [highlight-clojure (:buttons-disabled snippet)]])

(defn buttons-loading []
  (let [loading? (r/atom false)]
    (fn []
      [:div
       [button
        {:bs-style "primary"
         :disabled @loading?
         :on-click (fn []
                     (reset! loading? true)
                     (js/setTimeout #(reset! loading? false) 2000))}
        (if @loading? "Loading..." "Loading state")]
       [highlight-clojure (:buttons-loading snippet)]])))

(defn intro []
  [:div
   [buttons-options]
   [buttons-sizes]
   [buttons-active]
   [buttons-tags]
   [buttons-disabled]
   [buttons-loading]])
