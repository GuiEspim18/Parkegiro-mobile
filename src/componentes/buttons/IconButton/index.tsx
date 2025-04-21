import React from "react";
import { Pressable } from "react-native";
import { useNavigation } from "@react-navigation/native";
import { NativeStackNavigationProp } from "@react-navigation/native-stack";
import { RootStackParamList } from "../../Content"; // Importando o tipo de parâmetros da sua navegação

type RouteName = keyof RootStackParamList;

type IconButtonProps<Route extends RouteName> = {
  children: React.ReactNode; // O conteúdo que será passado dentro do IconButton
  routeName: Route; // O nome da rota que o botão vai navegar
  params?: RootStackParamList[Route]; // Parâmetros opcionais para a rota
};

function IconButton<Route extends RouteName>({
  routeName,
  params,
  children
}: IconButtonProps<Route>): React.JSX.Element {
  const navigation = useNavigation<NativeStackNavigationProp<RootStackParamList>>();

  const handlePress = () => {
    if (params === undefined) {
      navigation.navigate(routeName as any); // Navegar sem parâmetros
    } else {
      navigation.navigate(routeName as any, params); // Navegar com parâmetros
    }
  };

  return <Pressable onPress={handlePress}>{children}</Pressable>;
}

export default IconButton;
