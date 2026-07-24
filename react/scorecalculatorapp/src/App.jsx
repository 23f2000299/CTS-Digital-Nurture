import CalculateScore from "./Components/CalculateScore";

function App() {
  return (
    <>
      <CalculateScore
        name="John"
        school="ABC Public School"
        total={480}
        goal={5}
      />
    </>
  );
}

export default App;