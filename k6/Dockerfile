FROM loadimpact/k6

COPY k6-script.js /script.js

ENTRYPOINT ["k6", "run", "/script.js"]

# docker build . -t k6-container
# kubectl run --image=k6-container --image-pull-policy=Never k6-test