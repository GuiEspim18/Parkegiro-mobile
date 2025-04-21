import { RouteProp } from "@react-navigation/native";
import React from "react";
import { Text } from "react-native";
import { RootStackParamList } from "../../componentes/Content";

type ParkingLotRouteProp = RouteProp<RootStackParamList, 'ParkingLot'>;

type Props = {
  route: ParkingLotRouteProp;
};

function ParkingLot({ route }: Props): React.JSX.Element {
    return (
        <Text>Pátio</Text>
    );
}

export default ParkingLot;