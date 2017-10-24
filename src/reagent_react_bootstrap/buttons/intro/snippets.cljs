(ns reagent-react-bootstrap.buttons.intro.snippets)

(def snippet
  {:buttons-options
   "(defn buttons-instance []
  [button-toolbar
   [button \"Default\"]
   [button {:bs-style \"primary\"} \"Primary\"]
   [button {:bs-style \"success\"} \"Success\"]
   [button {:bs-style \"info\"} \"Info\"]
   [button {:bs-style \"warning\"} \"Warning\"]
   [button {:bs-style \"danger\"} \"Danger\"]
   [button {:bs-style \"link\"} \"Link\"]])

(r/render [buttons-instance] mount-node)"

   :buttons-sizes
   "(defn buttons-instance []
  [:div
   [button-toolbar
    [button {:bs-style \"primary\" :bs-size \"large\"} \"Large button\"]
    [button {:bs-size \"large\"} \"Large button\"]]
   [button-toolbar
    [button {:bs-style \"primary\"} \"Default button\"]
    [button \"Default button\"]]
   [button-toolbar
    [button {:bs-style \"primary\" :bs-size \"small\"} \"Small button\"]
    [button {:bs-size \"small\"} \"Small button\"]]
   [button-toolbar
    [button {:bs-style \"primary\" :bs-size \"xsmall\"} \"Extra small button\"]
    [button {:bs-size \"xsmall\"} \"Extra small button\"]]])

(r/render [buttons-instance] mount-node)"

   :buttons-active
   "(defn buttons-instance []
  [button-toolbar
   [button {:bs-style \"primary\" :bs-size \"large\" :active true} \"Primary button\"]
   [button {:bs-size \"large\" :active true} \"Button\"]])

(r/render [buttons-instance] mount-node)"

   :buttons-tags
   "(defn buttons-instance []
  [button-toolbar
   [button {:href \"#\"} \"Link\"]
   [button \"Button\"]])

(r/render [buttons-instance] mount-node)"

   :buttons-disabled
   "(defn buttons-instance []
  [button-toolbar
   [button {:bs-style \"primary\" :bs-size \"large\" :disabled true} \"Primary button\"]
   [button {:bs-size \"large\" :disabled true} \"Button\"]])

(r/render [buttons-instance] mount-node)"

   :buttons-loading
   "(defn loading-button []
  (let [loading? (r/atom false)]
    (fn []
      [button
       {:bs-style \"primary\"
        :disabled @loading?
        :on-click (fn []
                    (reset! loading? true)
                    (js/setTimeout #(reset! loading? false) 2000))}
       (if @loading? \"Loading...\" \"Loading state\")])))

(r/render [loading-button] mount-node)"})
